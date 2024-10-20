package deob;

import java.util.zip.Inflater;

@ObfuscatedName("ve")
public class class547 {

    @ObfuscatedName("ve.at")
    public Inflater field5282;

    public class547() {
        this(-1, 1000000, 1000000);
    }

    public class547(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ve.at(Luj;[BI)V")
    public void method9066(class527 arg0, byte[] arg1) {
        if (arg0.field5140[arg0.field5137] != 31 || arg0.field5140[arg0.field5137 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5282 == null) {
            this.field5282 = new Inflater(true);
        }
        try {
            this.field5282.setInput(arg0.field5140, arg0.field5137 + 10, arg0.field5140.length - (arg0.field5137 + 10 + 8));
            this.field5282.inflate(arg1);
        } catch (Exception var4) {
            this.field5282.reset();
            throw new RuntimeException("");
        }
        this.field5282.reset();
    }
}
