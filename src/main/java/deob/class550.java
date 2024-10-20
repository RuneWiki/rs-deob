package deob;

import java.util.zip.Inflater;

@ObfuscatedName("vb")
public class class550 {

    @ObfuscatedName("vb.ac")
    public Inflater field5276;

    public class550() {
        this(-1, 1000000, 1000000);
    }

    public class550(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("vb.ac(Lul;[BI)V")
    public void method8979(class530 arg0, byte[] arg1) {
        if (arg0.field5139[arg0.field5140] != 31 || arg0.field5139[arg0.field5140 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5276 == null) {
            this.field5276 = new Inflater(true);
        }
        try {
            this.field5276.setInput(arg0.field5139, arg0.field5140 + 10, arg0.field5139.length - (arg0.field5140 + 10 + 8));
            this.field5276.inflate(arg1);
        } catch (Exception var4) {
            this.field5276.reset();
            throw new RuntimeException("");
        }
        this.field5276.reset();
    }
}
