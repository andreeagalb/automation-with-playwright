# 🐧 Linux Terminal Cheat Sheet

This guide covers the essential commands and navigation shortcuts for the Linux command line.

---

## 📂 Navigation & File Management

| Command | Action | Example |
| --- | --- | --- |
| `pwd` | **Print Working Directory**: Shows where you are. | `pwd` |
| `ls` | **List**: Shows files and folders in current directory. | `ls -la` |
| `cd` | **Change Directory**: Move between folders. | `cd Documents` |
| `mkdir` | **Make Directory**: Creates a new folder. | `mkdir new_folder` |
| `rm` | **Remove**: Deletes files or directories. | `rm -r folder_name` |
| `cp` | **Copy**: Copies files or folders. | `cp file.txt backup.txt` |
| `mv` | **Move**: Moves or renames files. | `mv old.txt new.txt` |

---

## 📍 Directory Shortcuts

In Linux, every directory contains two "hidden" entries that represent your current location and the location above you.

| Shortcut | Representation | Common Use Case |
| --- | --- | --- |
| `.` | **Current Directory** | Running a script in your current folder: `./script.sh` |
| `..` | **Parent Directory** | Moving up one level: `cd ..` |

### Examples:

* **Move a file from elsewhere to here:** `cp /home/user/notes.txt .`
* **Jump up two levels:** `cd ../..`
* **Copy a file to the folder above you:** `cp image.png ..`

---

### 💡 Pro Tip: The Home Shortcut

While `.` and `..` are relative to where you are, the **`~` (tilde)** symbol always represents your **Home directory** (`/home/username`). It’s a great way to jump back home instantly by typing `cd ~`.


---

## 📍 Directory Shortcuts

Linux uses specific symbols to represent relative paths.

* **. (Single Dot)**: Represents the **current directory**.
* *Example:* `./my_script.sh` (Runs a script in the folder you are currently in).


* **.. (Double Dot)**: Represents the **parent directory** (one level up).
* *Example:* `cd ..` (Moves you up one folder).


* **~ (Tilde)**: Represents your **Home directory**.
* *Example:* `cd ~` (Returns you to `/home/username`).



---

## 📄 File Content & Editing

* **`cat`**: Displays the entire content of a file in the terminal.
* **`less`**: View a file one page at a time (use arrow keys to scroll).
* **`head` / `tail**`: Shows the first or last 10 lines of a file.
* **`nano` / `vim**`: Terminal-based text editors for modifying files.

---

## ⚙️ System & Permissions

* **`sudo`**: Execute a command with administrative (root) privileges.
* **`chmod`**: Change file permissions (e.g., `chmod +x script.sh`).
* **`top` / `htop**`: Displays active processes and resource usage (CPU/RAM).
* **`df -h`**: Shows available disk space in a human-readable format.
* **`man`**: The manual. Use `man <command>` to see the full documentation.

---

## 🔍 Searching & Piping

* **`grep`**: Search for specific text within files.
* **`find`**: Search for files based on name, size, or time.
* **`|` (Pipe)**: Takes the output of one command and sends it to another.
* *Example:* `ls -l | grep ".jpg"` (Lists all files but only shows those ending in .jpg).
