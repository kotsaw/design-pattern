#git remote rename origin origin-github
#git remote add origin https://innersource.soprasteria.com/guillaume.barry/design-pattern.git

#git remote rename origin origin-innersource
#git remote add origin https://github.com/jandry/design-pattern.git

# Switch to github
git remote rename origin origin-innerssource
git remote rename origin-github origin

# Pousser toutes les branches
git push -u origin --all

# Poussser branche courante
git push origin

# Clone repo
git clone https://github.com/jandry/design-pattern.git

# Récupérer mise à jours
git fetch origin

