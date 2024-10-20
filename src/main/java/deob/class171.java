package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gw")
public class class171 extends class515 {

    @ObfuscatedName("gw.ap")
    public boolean field1843;

    @ObfuscatedName("gw.aw")
    public boolean field1838 = true;

    @ObfuscatedName("gw.ak")
    public List field1836;

    @ObfuscatedName("gw.aj")
    public int[] field1839;

    @ObfuscatedName("gw.ai")
    public long field1837;

    @ObfuscatedName("gw.ay")
    public String field1840 = null;

    @ObfuscatedName("gw.as")
    public byte field1842;

    @ObfuscatedName("gw.ae")
    public byte field1846;

    static {
        new BitSet(65536);
    }

    public class171(class558 arg0) {
        this.method3547(arg0);
    }

    @ObfuscatedName("gw.ap(I)[I")
    public int[] method3542() {
        if (this.field1839 == null) {
            String[] var1 = new String[this.field1836.size()];
            this.field1839 = new int[this.field1836.size()];
            int var2 = 0;
            while (var2 < this.field1836.size()) {
                var1[var2] = ((class153) this.field1836.get(var2)).field1712.method9976();
                this.field1839[var2] = var2++;
            }
            int[] var3 = this.field1839;
            class552.method2340(var1, var3, 0, var1.length - 1);
        }
        return this.field1839;
    }

    @ObfuscatedName("gw.aw(Lfs;I)V")
    public void method3558(class153 arg0) {
        this.field1836.add(arg0);
        this.field1839 = null;
    }

    @ObfuscatedName("gw.ak(II)V")
    public void method3543(int arg0) {
        this.field1836.remove(arg0);
        this.field1839 = null;
    }

    @ObfuscatedName("gw.aj(I)I")
    public int method3541() {
        return this.field1836.size();
    }

    @ObfuscatedName("gw.ai(Ljava/lang/String;I)I")
    public int method3546(String arg0) {
        if (!this.field1838) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1836.size(); var2++) {
            if (((class153) this.field1836.get(var2)).field1712.method9989().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gw.ay(Lvl;B)V")
    public void method3547(class558 arg0) {
        int var2 = arg0.method9258();
        if ((var2 & 0x1) != 0) {
            this.field1843 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1838 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method9258();
        }
        this.field5170 = arg0.method9265();
        this.field1837 = arg0.method9265();
        this.field1840 = arg0.method9269();
        arg0.method9267();
        this.field1846 = arg0.method9259();
        this.field1842 = arg0.method9259();
        int var4 = arg0.method9260();
        if (var4 <= 0) {
            return;
        }
        this.field1836 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class153 var6 = new class153();
            if (this.field1843) {
                arg0.method9265();
            }
            if (this.field1838) {
                var6.field1712 = new class581(arg0.method9269());
            }
            var6.field1714 = arg0.method9259();
            var6.field1711 = arg0.method9260();
            if (var3 >= 3) {
                arg0.method9267();
            }
            this.field1836.add(var5, var6);
        }
    }
}
