Working on Branch_2_3
---------------------
    $ git clone git@github.com:user/Resteasy
    $ cd Resteasy/
    $ git remote add upstream git://github.com/resteasy/Resteasy.git
    $ git checkout -b b_2_3 origin/Branch_2_3

Do some changes/fixes, commit them.

    $ git add .
    $ git commit -m 'Added README.md'

Ensure the branch is upto date with upstream before pushing

    $ git pull --rebase upstream Branch_2_3
    $ git push origin b_2_3

* Goto github and choose the current pushed branch

[![](https://github.com/mageshbk/Resteasy/raw/b_2_3/SendPullRequest.png)](https://github.com/mageshbk/Resteasy/raw/b_2_3/SendPullRequest.png)

* Update commit range to be pushed to Branch_2_3

[![](https://github.com/mageshbk/Resteasy/raw/b_2_3/UpdateCommitRange.png)](https://github.com/mageshbk/Resteasy/raw/b_2_3/UpdateCommitRange.png)

* Send pull request
