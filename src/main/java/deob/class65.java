package deob;

import java.util.zip.Inflater;

@ObfuscatedName("bt")
public class class65 {

    @ObfuscatedName("bt.q")
    public Inflater field833;

    public class65() {
        this(-1, 1000000, 1000000);
    }

    public class65(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("bt.q(Let;[BI)V")
    public void method801(class136 arg0, byte[] arg1) {
        if (arg0.field1725[arg0.field1722] != 31 || arg0.field1725[arg0.field1722 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field833 == null) {
            this.field833 = new Inflater(true);
        }
        try {
            this.field833.setInput(arg0.field1725, arg0.field1722 + 10, arg0.field1725.length - (arg0.field1722 + 10 + 8));
            this.field833.inflate(arg1);
        } catch (Exception var4) {
            this.field833.reset();
            throw new RuntimeException("");
        }
        this.field833.reset();
    }
}
