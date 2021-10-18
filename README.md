#### obtenha um repositório
#### Crie Uma pasta e Clone um repositorio com o seguinte Comando

#### git clone caminhoRepositorio




#### adicionar & confirmar
#### Adicionar Um Arquivo Especifico

#### git add arquivo



#### Adicionar Tudo que a de novo no repositorio local

#### git add .
#### git add *


#### Confirmar as Alterações

#### git commit -m "comentários das alterações"





#### enviando alterações
#### Enviar Alterações para repositorio remoto

#### git push -u origin NomeDaBranch


#### Se voce quer conectar seu repositório a um servidor remoto

#### git remote add origin servidor


#### ramificar
#### Criar uma nova branch e a selecionar

#### git checkout -b NomeDaBranch

#### Retornar Para branch

#### git checkout NomeDaBranch


#### uma branch não está disponível a outros a menos que você a envie

#### git push -u origin NomeDaBranch


#### Remover Uma Branch local

#### git branch -d NomeDaBranch



#### atualizar & mesclar
  
#### Atualizar Repositorio

#### git pull

#### na sua pasta de trabalho para obter e fazer merge (mesclar) alterações remotas.
#### para fazer merge de um outro branch ao seu branch ativo (ex. main), use

#### git merge branch


#### o git vai tentar fazer o merge das alterações automaticamente
#### Mais isso pode resultar em conflitos que voce tera que resolver Manualmente
#### Depois de alterar, você precisa marcá-los como merged com o

#### git add arquivo
#### git add *

#### Para pre visualizar alterações

#### git diff branchorigem branchdestino



#### rotulando

#### Você pode obter o id de commit com
#### git log



#### sobrescrever alterações locais

#### Se fizer algo errado pode sobreescrever as alterações locais usando o commando

#### git checkout -- arquivo


#### Caso queira remover todas as alterações e commits locais,
#### recupere o histórico mais recente do servidor e aponte para seu branch master local desta forma

#### git fetch origin
#### git reset --hard origin/main




#### Encontre o ID do commit dele, você pode fazer isso com o git log.

#### git cherry-pick f13bd3c3531f26e805c606729857f39987a2420f




#### excluir um repositorio

#### rm -rf .git





#### remover uma pasta dentro do repositorio depois dar o commit e push para atualizar{

#### git rm -r NomeDaPasta




#### deletar uma branch remotagit fetch

#### git push origin --delete


#### Mostrar a diferenças entre arquivos

#### diff --git a/arquivo b/arquivo




#### Lista arquivos preparados, despreparados e que não foram monitorados.

#### git status


