package deob;

import java.util.Comparator;

@ObfuscatedName("lg")
public class class319 implements Comparator {

    @ObfuscatedName("lg.a")
    public final boolean field3844;

    public class319(boolean arg0) {
        this.field3844 = arg0;
    }

    @ObfuscatedName("lg.a(Lkn;Lkn;B)I")
    public int method5489(class289 arg0, class289 arg1) {
        return this.field3844 ? arg0.method5090().method5239(arg1.method5090()) : arg1.method5090().method5239(arg0.method5090());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5489((class289) arg0, (class289) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
