# TestGit

# obtenha um repositório
# Crie Uma pasta e Clone um repositorio com o seguinte Comando

# git clone <caminhoRepositorio>
# Exemplo: git clone https://github.com/EduardoGautier/Java.git



# adicionar & confirmar
# Adicionar Um Arquivo Especifico

# git add <arquivo>
# Exemplo: git add README.md


# Adicionar Tudo que a de novo no repositorio local

# git add .
# git add *


# Confirmar as Alterações

# git commit -m "comentários das alterações"
# Exemplo: git commit -m "First Commit"




# enviando alterações
# Enviar Alterações para repositorio remoto

# git push -u origin <Nome Da Branch>
# Exemplo: git push -u origin main

# Se voce quer conectar seu repositório a um servidor remoto

# git remote add origin <servidor>
# exemplo: git remote add origin https://github.com/EduardoGautier/ProjAgd.git


# ramificar
# Criar uma nova branch e a selecionar

# git checkout -b <Nome Da Branch>
# Exemplo: git checkout -b subMain

# Retornar Para branch

# git checkout <Nome Da Branch>
# Exemplo: git checkout main

# uma branch não está disponível a outros a menos que você a envie
# git push -u origin <Nome Da Branch>
# Exemplo: git push -u origin subMain

# Remover Uma Branch

# git branch -d <Nome Da Branch>
# Exemplo: git branch -d subMain


# atualizar & mesclar

# Atualizar Repositorio

# git pull

# na sua pasta de trabalho para obter e fazer merge (mesclar) alterações remotas.
# para fazer merge de um outro branch ao seu branch ativo (ex. main), use

# git merge <branch>
# Exemplo git merge subMain

# o git vai tentar fazer o merge das alterações automaticamente
# Mais isso pode resultar em conflitos que voce tera que resolver Manualmente
# Depois de alterar, você precisa marcá-los como merged com o

# git add <arquivo>
# git add *

# Para pre visualizar alterações

# git diff <branch origem> <branch destino>
# Exemplo: git diff subMain main


# rotulando

# Você pode obter o id de commit com
# git log



# sobrescrever alterações locais

# Se fizer algo errado pode sobreescrever as alterações locais usando o commando

# git checkout -- <arquivo>
# git checkout -- Biblioteca

# Caso queira remover todas as alterações e commits locais,
# recupere o histórico mais recente do servidor e aponte para seu branch master local desta forma

# git fetch origin
# git reset --hard origin/main





# Encontre o ID do commit dele, você pode fazer isso com o git log.

# git cherry-pick f13bd3c3531f26e805c606729857f39987a2420f



excluir um repositorio

rm -rf .git





remover uma pasta dentro do repositorio depois dar o commit e push para atualizar{

git rm -r <Nome Da Pasta>
Exemplo: git rm -r Biblioteca 








