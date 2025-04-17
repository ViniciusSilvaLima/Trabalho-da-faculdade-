document.addEventListener("DOMContentLoaded", () => {
  const modal = document.getElementById("downloadModal");
  const openBtn = document.getElementById("openModalBtn");
  const closeBtn = document.querySelector(".close");

  openBtn.addEventListener("click", () => {
    modal.classList.remove("hidden");
  });

  closeBtn.addEventListener("click", () => {
    modal.classList.add("hidden");
  });

  window.addEventListener("click", (e) => {
    if (e.target === modal) {
      modal.classList.add("hidden");
    }
  });
});

function abrirModal() {
  document.getElementById("modalDownload").style.display = "block";
}

function fecharModal() {
  document.getElementById("modalDownload").style.display = "none";
}

function baixarArquivo(nomeArquivo) {
  const caminho = "documentos/" + nomeArquivo;
  const link = document.createElement("a");
  link.href = caminho;
  link.download = nomeArquivo;
  document.body.appendChild(link);
  link.click();
  document.body.removeChild(link);
}
