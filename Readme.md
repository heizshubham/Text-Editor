# Text Editor Application

A simple Java-based Text Editor that allows users to open, edit, and save text files with basic functionality like word wrapping.

<img width="963" alt="image" src="https://github.com/user-attachments/assets/dc73a10e-2590-4e81-aeed-b594c874db55">

<img width="552" alt="image" src="https://github.com/user-attachments/assets/e29fb64c-8c7d-491b-9e53-12127ad87ebc">


## Features
- **File Operations**:
  - Open text files and display content in the text editor.
  - Save current text to a file.
- **Text Wrapping**:
  - Enable or disable word wrapping within the editor.
- **Keyboard Shortcuts**:
  - `Ctrl+O` to open a file using the file chooser dialog.
  
## Components Used
- **JFrame**: Main application window.
- **JMenuBar**: Holds menus for File and Edit options.
- **JMenu**: Menu items for `File` and `Edit`.
- **JMenuItem**: Menu items for Open and Save operations.
- **JCheckBoxMenuItem**: Checkbox menu item for toggling word wrapping.
- **JTextArea**: Editable text area.
- **JScrollPane**: Scrollable container for the text area.

## How to Run

1. **Prerequisites**: 
   - Ensure you have Java Development Kit (JDK) version 8 or higher installed.

2. **Compilation**: 
   Open a terminal/command prompt, navigate to the directory containing the source code, and run:
   ```bash
   javac TextEditor.java



## Code Explanation

** Main Window:** The TextEditor class extends JFrame to create the main application window.
** Menus:** The JMenuBar contains two menus, File and Edit.
** File Menu:**
Open: Opens a file and displays its content in the JTextArea.
Save: Saves the content of the JTextArea to a file.
Edit Menu:
Wrap: Enables/disables word wrapping in the JTextArea.
JTextArea: A scrollable text area is implemented using JScrollPane.
Key Methods:
actionPerformed(ActionEvent ae): Handles file open and save events using a JFileChooser.
main(String[] args): Launches the application.
Usage
Open a File: Use the menu File -> Open (or press Ctrl+O) to open and display a text file.
Save a File: Use the menu File -> Save to save the current text to a file.
Enable/Disable Word Wrap: Use the menu Edit -> Wrap to toggle word wrapping.
Future Enhancements
Add features like cut, copy, paste, and find functionality.
Improve error handling for file operations.


## Author
Developed by Shubham Pandey (@heizshubham).


This is the markdown code you can copy directly into a **README.md** file for your GitHub repository. Let me know if you need help with anything else!
