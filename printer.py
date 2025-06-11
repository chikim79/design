#!/usr/bin/env python3
"""
Script to combine all Java files in current directory and subdirectories
into a single text file with filename headers.
"""

import os
import glob
from pathlib import Path

def combine_java_files(output_filename="combined_java_files.txt"):
    """
    Combine all Java files in current directory and subdirectories
    into a single text file with headers showing the filename.

    Args:
        output_filename (str): Name of the output file
    """
    # Find all .java files recursively
    java_files = glob.glob("**/*.java", recursive=True)

    if not java_files:
        print("No Java files found in current directory or subdirectories.")
        return

    # Sort files for consistent output
    java_files.sort()

    try:
        with open(output_filename, 'w', encoding='utf-8') as output_file:
            print(f"Combining {len(java_files)} Java files into {output_filename}...")

            for i, java_file in enumerate(java_files):
                # Create header with filename
                header = f"\n{'='*80}\n"
                header += f"FILE: {java_file}\n"
                header += f"{'='*80}\n\n"

                output_file.write(header)

                try:
                    # Read and write the Java file content
                    with open(java_file, 'r', encoding='utf-8') as input_file:
                        content = input_file.read()
                        output_file.write(content)

                        # Add some spacing between files (except for the last one)
                        if i < len(java_files) - 1:
                            output_file.write("\n\n")

                except Exception as e:
                    error_msg = f"Error reading file {java_file}: {str(e)}\n\n"
                    output_file.write(error_msg)
                    print(f"Warning: {error_msg.strip()}")

        print(f"Successfully combined {len(java_files)} Java files into {output_filename}")

        # Display summary
        total_size = os.path.getsize(output_filename)
        print(f"Output file size: {total_size:,} bytes")
        print(f"Files processed:")
        for java_file in java_files:
            try:
                file_size = os.path.getsize(java_file)
                print(f"  - {java_file} ({file_size:,} bytes)")
            except Exception:
                print(f"  - {java_file} (size unknown)")

    except Exception as e:
        print(f"Error creating output file: {str(e)}")

def main():
    """Main function to run the script."""
    print("Java Files Combiner")
    print("=" * 50)
    print(f"Current directory: {os.getcwd()}")

    # Allow user to specify custom output filename
    custom_name = input("Enter output filename (or press Enter for 'combined_java_files.txt'): ").strip()
    output_name = custom_name if custom_name else "combined_java_files.txt"

    # Ensure output file has .txt extension
    if not output_name.endswith('.txt'):
        output_name += '.txt'

    combine_java_files(output_name)

if __name__ == "__main__":
    main()