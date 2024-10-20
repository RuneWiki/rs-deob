package deob;

import java.util.zip.Inflater;

@ObfuscatedName("vn")
public class class551 {

    @ObfuscatedName("vn.am")
    public Inflater field5320;

    public class551() {
        this(-1, 1000000, 1000000);
    }

    public class551(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("vn.am(Luk;[BI)V")
    public void method9147(class531 arg0, byte[] arg1) {
        if (arg0.field5178[arg0.field5181] != 31 || arg0.field5178[arg0.field5181 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5320 == null) {
            this.field5320 = new Inflater(true);
        }
        try {
            this.field5320.setInput(arg0.field5178, arg0.field5181 + 10, arg0.field5178.length - (arg0.field5181 + 10 + 8));
            this.field5320.inflate(arg1);
        } catch (Exception var4) {
            this.field5320.reset();
            throw new RuntimeException("");
        }
        this.field5320.reset();
    }
}
