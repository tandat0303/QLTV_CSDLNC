package Book;

import Admin.AdminForm;
import Login.LoginForm;
import com.mongodb.BasicDBObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;

public class BookManagement extends javax.swing.JFrame {

    /**
     * Creates new form BookManagement_GUI
     */
    public BookManagement(String username) {
        this.loggedInUsername = username;
        initComponents();
        setTitle("Thư viện SGUni");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
                      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        comboSearch = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        isbnField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboCategory = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        publisherField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stateField = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookList = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnBack = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnLogOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        priceField.setText("0");
        
        jLabel1.setText("Tìm kiếm");

        jLabel2.setText("Tìm kiếm theo: ");

        stateField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Đã nhập", "Chưa nhập" }));
        
        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Mã sách", "Tên sách", "Nhà xuất bản", "Thể loại" }));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png")));
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setText("Thông tin sách");

        jLabel4.setText("Mã sách:");

        jLabel5.setText("Tên sách:");

        jLabel6.setText("Thể loại:");

        comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Thiếu nhi", "Văn hóa xã hội", "Lịch sử", "Tiểu sử, tự truyện", "Trinh thám" }));

        jLabel7.setText("Nhà xuất bản:");

        jLabel8.setText("Giá sách:");

        jLabel9.setText("(VNĐ)");

        jLabel10.setText("Trạng thái:");

        bookList.setModel(new NonEditableTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Thể loại", "Nhà xuất bản", "Giá sách", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(bookList);

        jLabel11.setText("Chức năng");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png")));
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png")));
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete-folder.png")));
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh-button.png")));
        btnRefresh.setText("Làm mới");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book.png")));
        jMenu1.setText("Quản lý sách");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/previous.png")));
        btnBack.setText("Quay về");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jMenu1.add(btnBack);
        jMenu1.add(jSeparator1);

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log-out.png"))); // NOI18N
        btnLogOut.setText("Đăng xuất");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jMenu1.add(btnLogOut);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnSearch)
                .addGap(63, 63, 63))
            .addComponent(jSeparator4)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isbnField)
                            .addComponent(nameField)
                            .addComponent(comboCategory, 0, 230, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(priceField, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(stateField))
                                .addGap(13, 13, 13)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(publisherField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(27, 27, 27)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publisherField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        
        setLocationRelativeTo(null);
        
        loadData();
    }// </editor-fold>                        

    private void loadData() {
        try {
            MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
            MongoDatabase database = mongoClient.getDatabase("QUANLYTHUVIEN");
            MongoCollection<Document> collection = database.getCollection("qlySach");

            FindIterable<Document> documents = collection.find();

            DefaultTableModel model = (DefaultTableModel) bookList.getModel();
            model.setRowCount(0);

            for (Document document : documents) {
                String isbn = document.getString("masach");
                String name = document.getString("tensach");
                String category = document.getString("theloai");
                String publisher = document.getString("nhaxuatban");
                int price = document.getInteger("giasach");
                String state = document.getString("trangthai");

                model.addRow(new Object[]{isbn, name, category, publisher, price, state});
            }

            mongoClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static class NonEditableTableModel extends DefaultTableModel {
        public NonEditableTableModel(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {                                        
        AdminForm af = new AdminForm(loggedInUsername);
        af.setVisible(true);
        
        this.dispose();
    }
    
    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {                                        
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        
        this.dispose();
    }                                       

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
            MongoDatabase database = mongoClient.getDatabase("QUANLYTHUVIEN");
            MongoCollection<Document> collection = database.getCollection("qlySach");

            String isbn = isbnField.getText();
            String name = nameField.getText();
            String category = comboCategory.getSelectedItem().toString();
            String publisher = publisherField.getText();
            String priceText = priceField.getText();
            String stateText = stateField.getSelectedItem().toString();

            List<String> missingFields = new ArrayList<>();

            if (isbn.isEmpty()) {
                missingFields.add("Mã sách");
            }
            if (name.isEmpty()) {
                missingFields.add("Tên sách");
            }
            if (category.isEmpty()) {
                missingFields.add("Thể loại");
            }
            if (publisher.isEmpty()) {
                missingFields.add("Nhà xuất bản");
            }
            if (priceText.isEmpty()) {
                missingFields.add("Giá sách");
            }
            if (stateText.isEmpty()) {
                missingFields.add("Trạng thái");
            }

            if (collection.countDocuments(Filters.eq("masach", isbn)) > 0) {
                JOptionPane.showMessageDialog(this, "Mã sách đã tồn tại. Vui lòng chọn mã sách khác.");
                return;
            }

            if (!missingFields.isEmpty()) {
                String missingFieldsMessage = "Nhập đầy đủ các thông tin sau để thêm:\n";
                for (String missingField : missingFields) {
                    missingFieldsMessage += "- " + missingField + "\n";
                }
                JOptionPane.showMessageDialog(this, missingFieldsMessage);
            } else {
                try {
                    int price = Integer.parseInt(priceText);

                    if (price <= 0) {
                        JOptionPane.showMessageDialog(this, "Vui lòng điều chỉnh giá sách !");
                        return;
                    }

                    Document document = new Document("masach", isbn)
                            .append("tensach", name)
                            .append("theloai", category)
                            .append("nhaxuatban", publisher)
                            .append("giasach", price)
                            .append("trangthai", stateText);

                    collection.insertOne(document);

                    JOptionPane.showMessageDialog(this, "Thêm sách thành công!");

                    refresh();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Giá nhập vào phải là số.");
                }
            }

            mongoClient.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Thêm sách thất bại!");
        }
    }
    
    private void refresh() {
        loadData();

        isbnField.setText("");
        nameField.setText("");
        comboCategory.setSelectedIndex(0);
        publisherField.setText("");
        priceField.setText("0");
        stateField.setSelectedIndex(0);
        comboSearch.setSelectedIndex(0);
        searchField.setText("");
    }

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {                                        
        displaySelectedBookInfo();

        loadData();
    }
    
    private void displaySelectedBookInfo() {
        int selectedRow = bookList.getSelectedRow();

        if (selectedRow != -1) {
            String isbn = bookList.getValueAt(selectedRow, 0).toString();
            String name = bookList.getValueAt(selectedRow, 1).toString();
            String category = bookList.getValueAt(selectedRow, 2).toString();
            String publisher = bookList.getValueAt(selectedRow, 3).toString();
            String price = bookList.getValueAt(selectedRow, 4).toString();
            String state = bookList.getValueAt(selectedRow, 5).toString();

            EditBook editBookFrame = new EditBook(this, true);
            editBookFrame.setBookInfo(isbn, name, category, publisher, price, state);
            editBookFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách để sửa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String searchCategory = comboSearch.getSelectedItem().toString();
        String searchText = searchField.getText().trim();

        if (searchCategory.isEmpty()) {
            searchField.setText("");
            loadData();
            return;
        }

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập thông tin để tìm kiếm.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
            MongoDatabase database = mongoClient.getDatabase("QUANLYTHUVIEN");
            MongoCollection<Document> collection = database.getCollection("qlySach");

            BasicDBObject query = new BasicDBObject();

            switch (searchCategory) {
                case "Mã sách":
                    query.put("masach", java.util.regex.Pattern.compile(searchText, Pattern.CASE_INSENSITIVE));
                    break;
                case "Tên sách":
                    query.put("tensach", java.util.regex.Pattern.compile(searchText, Pattern.CASE_INSENSITIVE));
                    break;
                case "Nhà xuất bản":
                    query.put("nhaxuatban", java.util.regex.Pattern.compile(searchText, Pattern.CASE_INSENSITIVE));
                    break;
                case "Thể loại":
                    query.put("theloai", java.util.regex.Pattern.compile(searchText, Pattern.CASE_INSENSITIVE));
                    break;
            }

            FindIterable<Document> documents = collection.find(query);

            DefaultTableModel model = (DefaultTableModel) bookList.getModel();
            model.setRowCount(0);

            for (Document document : documents) {
                String isbn = document.getString("masach");
                String name = document.getString("tensach");
                String category = document.getString("theloai");
                String publisher = document.getString("nhaxuatban");
                int price = document.getInteger("giasach");
                String state = document.getString("trangthai");

                model.addRow(new Object[]{isbn, name, category, publisher, price, state});
            }

            mongoClient.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm sách.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int selectedRow = bookList.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách để xóa.", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int result = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa sách này không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            try {
                String isbn = bookList.getValueAt(selectedRow, 0).toString();

                MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
                MongoDatabase database = mongoClient.getDatabase("QUANLYTHUVIEN");
                MongoCollection<Document> collection = database.getCollection("qlySach");

                collection.deleteOne(Filters.eq("masach", isbn));

                JOptionPane.showMessageDialog(this, "Xóa sách thành công!");

                refresh();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Xóa sách thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (isAnyFieldFilled()) {
            int result = JOptionPane.showConfirmDialog(this, "Bạn có muốn tiếp tục thêm sách mới không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                return;
            }
        }

        refresh();
        JOptionPane.showMessageDialog(this, "Làm mới thành công!");
    }

    private boolean isAnyFieldFilled() {
        return !isbnField.getText().isEmpty() ||
               !nameField.getText().isEmpty() ||
               comboCategory.getSelectedIndex() != 0 ||
               !publisherField.getText().isEmpty() ||
               !priceField.getText().equals("0") ||
               stateField.getSelectedIndex() != 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookManagement_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManagement_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManagement_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManagement_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManagement(loggedInUsername).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTable bookList;
    private javax.swing.JButton btnAdd;
    private javax.swing.JMenuItem btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JMenuItem btnLogOut;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField publisherField;
    private javax.swing.JComboBox<String> stateField;
    private javax.swing.JTextField searchField;                 
    private static String loggedInUsername;
}
