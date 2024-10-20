package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gm")
public class class171 extends class508 {

    @ObfuscatedName("gm.ac")
    public boolean field1839;

    @ObfuscatedName("gm.ae")
    public boolean field1835 = true;

    @ObfuscatedName("gm.ag")
    public List field1836;

    @ObfuscatedName("gm.am")
    public int[] field1837;

    @ObfuscatedName("gm.ax")
    public long field1838;

    @ObfuscatedName("gm.aq")
    public String field1841 = null;

    @ObfuscatedName("gm.af")
    public byte field1840;

    @ObfuscatedName("gm.at")
    public byte field1834;

    static {
        new BitSet(65536);
    }

    public class171(class551 arg0) {
        this.method3401(arg0);
    }

    @ObfuscatedName("gm.ac(I)[I")
    public int[] method3388() {
        if (this.field1837 == null) {
            String[] var1 = new String[this.field1836.size()];
            this.field1837 = new int[this.field1836.size()];
            int var2 = 0;
            while (var2 < this.field1836.size()) {
                var1[var2] = ((class153) this.field1836.get(var2)).field1711.method9622();
                this.field1837[var2] = var2++;
            }
            class545.method3207(var1, this.field1837);
        }
        return this.field1837;
    }

    @ObfuscatedName("gm.ae(Lfy;B)V")
    public void method3389(class153 arg0) {
        this.field1836.add(arg0);
        this.field1837 = null;
    }

    @ObfuscatedName("gm.ag(II)V")
    public void method3390(int arg0) {
        this.field1836.remove(arg0);
        this.field1837 = null;
    }

    @ObfuscatedName("gm.am(I)I")
    public int method3391() {
        return this.field1836.size();
    }

    @ObfuscatedName("gm.ax(Ljava/lang/String;I)I")
    public int method3392(String arg0) {
        if (!this.field1835) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1836.size(); var2++) {
            if (((class153) this.field1836.get(var2)).field1711.method9621().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gm.aq(Lvf;I)V")
    public void method3401(class551 arg0) {
        int var2 = arg0.method8955();
        if ((var2 & 0x1) != 0) {
            this.field1839 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1835 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8955();
        }
        this.field5122 = arg0.method8980();
        this.field1838 = arg0.method8980();
        this.field1841 = arg0.method9166();
        arg0.method8982();
        this.field1834 = arg0.method8975();
        this.field1840 = arg0.method8975();
        int var4 = arg0.method9119();
        if (var4 <= 0) {
            return;
        }
        this.field1836 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class153 var6 = new class153();
            if (this.field1839) {
                arg0.method8980();
            }
            if (this.field1835) {
                var6.field1711 = new class574(arg0.method9166());
            }
            var6.field1712 = arg0.method8975();
            var6.field1713 = arg0.method9119();
            if (var3 >= 3) {
                arg0.method8982();
            }
            this.field1836.add(var5, var6);
        }
    }
}
