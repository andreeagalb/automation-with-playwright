# 🐙 Git Basics Cheat Sheet

Git is a version control system that tracks changes in your code. Think of it as a "save game" system for your projects.

---

## 🛠️ Setup & Configuration

Run these once when you first install Git on your machine to identify your contributions.

```bash
git config --global user.name "Your Name"
git config --global user.email "youremail@example.com"

```

---

## 🏗️ Creating & Getting Repositories

| Command | Action |
| --- | --- |
| `git init` | **Initialize**: Turn the current folder into a Git repository. |
| `git clone <url>` | **Clone**: Download an existing repository from a remote source (like GitHub). |

---

## 🔄 The Basic Workflow (Add & Commit)

The standard loop for saving your work:

1. **`git status`**: See which files have changed and what is currently staged.
2. **`git add <file>`**: Stage a specific file for the next "save."
* *Tip:* Use `git add .` to stage **all** modified and new files.


3. **`git commit -m "Your message"`**: Create a permanent snapshot of the staged changes with a descriptive message.

---

## 🌿 Branching & Merging

Branches allow you to work on new features without breaking the main code.

* **`git branch`**: List all local branches in your repository.
* **`git checkout -b <name>`**: Create a new branch and switch to it instantly.
* **`git switch <name>`**: A modern alternative to `checkout` for switching branches.
* **`git merge <name>`**: Combine the work from the specified branch into your current one.

---

## 🌐 Remote Collaboration (Syncing)

Commands for interacting with remote platforms like GitHub, GitLab, or Bitbucket.

* **`git remote add origin <url>`**: Link your local folder to a remote repository online.
* **`git pull`**: Fetch and download the latest changes from the remote and merge them into your local branch.
* **`git push origin <branch>`**: Upload your local commits to the remote repository.

---

## 🔍 Inspection & Recovery

* **`git log`**: View a chronological history of all commits.
* **`git diff`**: See the exact line-by-line changes between your working directory and the last commit.
* **`git stash`**: Temporarily "hide" uncommitted changes so you can switch branches without committing.
* **`git stash pop`**: Bring your hidden changes back and remove them from the stash.

---

### 💡 The "Golden Loop"

If you are working with a team, your daily routine usually looks like this:

1. `git pull` (Get latest work)
2. *... do some coding ...*
3. `git add .` (Stage changes)
4. `git commit -m "Describe work"` (Save locally)
5. `git push` (Share with the team)

----------------------------------------------------------------------------------------------------
