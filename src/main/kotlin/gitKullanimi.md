# Git Kullanımı

## 📌 Git Nedir?
Git, versiyon kontrol sistemi olarak kullanılır ve projelerin geçmiş değişikliklerini takip etmeye yardımcı olur.

---
## 🔧 Git Konfigürasyonu

- `git config --global user.name "ERay"` → Kullanıcı adını belirler.
- `git config --global user.email "eray0505@yandex.com"` → Kullanıcı e-posta adresini belirler.
- Bu ayarlamalar yapıldıktan sonra commit'lerde "ERay" olarak görünecektir.

---
## 📥 Proje Klonlama

- `git clone [url]` → Uzak bir repoyu yerel bilgisayara indirir.

---
## 📊 Durum Kontrolü

- `git status`
  - Hangi branch’te olduğumuzu gösterir.
  - Hangi dosyaların değiştirildiğini gösterir.

---
## 📂 Değişiklikleri Yönetme

- **Dosya eklemek için:**
  - `git add [file]` → Değişiklikleri staging area'ya ekler.
- **Stage’den dosya çıkarmak için:**
  - `git reset [file]` → Staging area’yı temizler.
- **Değişiklikleri görmek için:**
  - `git diff` → Çalışma alanındaki değişiklikleri gösterir (henüz `git add` ile eklenmemiş).
  - `git diff --staged` → `git add` ile eklenen ama henüz commit edilmemiş değişiklikleri gösterir.

---
## 🔄 Uzak Repo ile Senkronizasyon

- `git fetch` → Uzak repodaki değişiklikleri indirir ama çalışma alanını güncellemez.
- `git pull` → Uzak depodaki değişiklikleri indirir ve yerel branch ile birleştirir.

---
## 🌿 Branch Yönetimi

- **Yeni branch oluşturmak:** `git checkout -b yeni-branch`
- **Branch değiştirmek:** `git checkout branch-adi` veya `git switch branch-adi`
- **Branch’leri listelemek:** `git branch`
- **Branch’leri birleştirmek:** `git checkout main` ardından `git merge branch-adi`
- **Branch silmek:** `git branch -d branch-adi`

---


