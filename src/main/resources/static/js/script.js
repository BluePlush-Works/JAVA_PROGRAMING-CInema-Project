function mostrarMensagem(){
    alert("Operação Realizada com Sucesso!")
    }

function destacarNomes(){
const nomes=document.querySelectorAll(".nome-registo");
nomes.forEach(function(nome){nome.classList.toggle("destacado");
});
}



function limparTemas(){
    document.body.classList.remove(
        "tema-cliente",
        "tema-funcionario",
        "tema-utilizador")
}

function mudarFormulario(){
    const perfil = document.getElementById("perfil");
    const tituloFormulario = document.getElementById("tituloFormulario");
    const campoNif = document.getElementById("campoNif");
    const nif = document.getElementById("nif");
    const camponFuncionario = document.getElementById("camponFuncionario");
    const nFuncionario = document.getElementById("nFuncionario");
    const campoCargo = document.getElementById("campoCargo");
    const cargo=document.getElementById("cargo");
    const campoTurno = document.getElementById("campoTurno");
    const turno = document.getElementById("turno");


    if(!perfil || !tituloFormulario || !camponFuncionario || !nFuncionario || !campoCargo || !cargo || campoTurno || !turno || !campoNif || !nif){
        return;
    }

    limparTemas();

    if(perfil.value === "CLIENTE"){
        tituloFormulario.textContent = "Novo Cliente";
        campoNif.style.display = "block";
        nif.required = true;
        camponFuncionario.style.display = "none";
        nFuncionario.required = false;
        cargo.required = false;
        campoCargo.style.display = "none";
       cargo.value = "";
        turno.required = false;
        campoTurno.style.display = "none";
        turno.value = "";
        document.body.classList.add("tema-cliente");

    }else if(perfil.value === "FUNCIONARIO"){
        tituloFormulario.textContent = "Novo Funcionário";
        campoNif.style.display = "none";
        nif.required = false;
        nif.value = "";
        camponFuncionario.style.display = "block";
        nFuncionario.required = true;
        cargo.required = true;
        campoCargo.style.display = "block";
        turno.required = true;
        campoTurno.style.display = "block";
        document.body.classList.add("tema-funcionario");

    }else{
        tituloFormulario.textContent = "Novo Utilizador";
        campoNif.style.display = "none";
        nif.required = false;
        nif.value = "";
        camponFuncionario.style.display = "none";
        nFuncionario.required = false;
        nFuncionario.value = "";
        cargo.required = false;
        campoCargo.style.display = "none";
        cargo.value = "";
        turno.required = false;
        campoTurno.style.display = "none";
        turno.value = "";
        document.body.classList.add("tema-utilizador");
    }

}

function mudarTituloListagem(){
    const tipoPagina = document.getElementById("tipoPagina");
    const tituloListagem= document.getElementById("tituloListagem");
    const subtituloListagem= document.getElementById("subtituloListagem");

    if(!tipoPagina || !tituloListagem){
        return;}

    limparTemas();

    if(tipoPagina.value === "CLIENTE"){
        tituloListagem.textContent = "Listar Clientes";

        if (subtituloListagem) {
            subtituloListagem.textContent = "Clientes registados.";
        }

        document.body.classList.add("tema-cliente");
    } else if (tipoPagina.value === "FUNCIONARIO") {
        tituloListagem.textContent = "Listar Funcionários";

        if (subtituloListagem) {
            subtituloListagem.textContent = "Funcionários registados na clínica.";
        }

        document.body.classList.add("tema-funcionario");
    }

     else if (tipoPagina.value === "UTILIZADOR") {
        tituloListagem.textContent = "Listar Utilizadores";

        if (subtituloListagem) {
            subtituloListagem.textContent = "Todos os utilizadores registados no sistema.";
        }

        document.body.classList.add("tema-utilizador");
    } else {
        tituloListagem.textContent = "Listar";
        document.body.classList.add("tema-utilizador");
    }
}

window.onload = function() {
    mudarFormulario();
    mudarTituloListagem();
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



