# GoogleRepo…or create a new repository on the command line

echo "# FirstRepo" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/shuvashishny/FirstRepo.git
git push -u origin master
