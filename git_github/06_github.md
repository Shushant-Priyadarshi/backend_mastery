# Getting started with Github

## Github 
 **Github** is a web-based Git repository hosting service. It is a popular platform for developers to collaborate on projects and to share code. Github provides a user-friendly interface for managing and tracking changes to your code, as well as a platform for hosting and sharing your projects with others.

### Some other alternative of Github are:
- Gitlab
- Bitbucket
- Azure Repos
- Gitea
But mainstream popular tool these days is Github.


## Adding code to remote repository

```sh
git init
git add <files>
git commit -m "commit message"
git remote add origin https://github.com/Shushant-Priyadarshi/LearningGithub.git
git push origin main
```

## Setup an upstream remote

- Setting up an upstream remote is useful when you want to keep your local repository up to date with the remote repository. It allows you to fetch and merge changes from the remote repository into your local repository.

```sh
git remote add upstream <remote-url>
git remote add -u <remote-url>
git push -u origin main
```

- This will allow you to run future commands like **`git pull`** and **`git push`** without specifying the remote name.

## Get code from remote repository

- There are two ways to get code from a remote repository:
    - fetch the code
    - pull the code

### Fetch

- **`git fetch`** downloads changes (commits, branches, and tags) from the remote repository but does not merge them into your local branch.
- It allows you to review changes before integrating them.
- It is safe as it does not modify your working directory.

```sh
# Fetch updates from the remote repository
git fetch

# Fetch updates from a specific remote branch
git fetch origin branch-name

# Fetch all branches and tags
git fetch --all


```

### Pull

- **`git pull`** is a combination of git fetch and git merge.
- It downloads the latest changes and automatically merges them into your current branch.
- It can cause merge conflicts if there are changes in both local and remote branches.

```sh
# Pull and merge updates from the remote repository
git pull

# Pull from a specific branch
git pull origin branch-name

```



