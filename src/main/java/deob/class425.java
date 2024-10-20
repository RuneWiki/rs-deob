package deob;

import java.util.Comparator;

@ObfuscatedName("pr")
public class class425 implements Comparator {

    @ObfuscatedName("pr.c")
    public final boolean field4535;

    public class425(boolean arg0) {
        this.field4535 = arg0;
    }

    @ObfuscatedName("pr.c(Lmv;Lmv;B)I")
    public int method6918(class350 arg0, class350 arg1) {
        return this.field4535 ? arg0.method5770().method7190(arg1.method5770()) : arg1.method5770().method7190(arg0.method5770());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6918((class350) arg0, (class350) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
