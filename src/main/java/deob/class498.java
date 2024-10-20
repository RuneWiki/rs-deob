package deob;

import java.util.zip.Inflater;

@ObfuscatedName("te")
public class class498 {

    @ObfuscatedName("te.aj")
    public Inflater field5043;

    public class498() {
        this(-1, 1000000, 1000000);
    }

    public class498(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("te.aj(Lsy;[BI)V")
    public void method8479(class478 arg0, byte[] arg1) {
        if (arg0.field4906[arg0.field4904] != 31 || arg0.field4906[arg0.field4904 + 1] != -117) {
            throw new RuntimeException("");
        }
        if (this.field5043 == null) {
            this.field5043 = new Inflater(true);
        }
        try {
            this.field5043.setInput(arg0.field4906, arg0.field4904 + 10, arg0.field4906.length - (arg0.field4904 + 10 + 8));
            this.field5043.inflate(arg1);
        } catch (Exception var4) {
            this.field5043.reset();
            throw new RuntimeException("");
        }
        this.field5043.reset();
    }
}
