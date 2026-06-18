function mostrarMensagem(){
    alert("Operação Realizada com Sucesso!")
    }

function destacarNomes(){
const nomes=document.querySelectorAll(".nome-registo");
nomes.forEach(function(nome){nome.classList.toggle("destacado");
});
}

function esconderMostrarTabela(){
const tabela = document.getElementById("tabelaRegisto");
if (tabela.style.display==="none"){
tabela.style.display="table";
}
else {
tabela.style.display="none";
}
}