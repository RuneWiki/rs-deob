package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gx")
public class class169 extends class506 {

    @ObfuscatedName("gx.ab")
    public boolean field1806;

    @ObfuscatedName("gx.ay")
    public boolean field1801 = true;

    @ObfuscatedName("gx.an")
    public List field1802;

    @ObfuscatedName("gx.au")
    public int[] field1800;

    @ObfuscatedName("gx.ax")
    public long field1804;

    @ObfuscatedName("gx.ao")
    public String field1803 = null;

    @ObfuscatedName("gx.am")
    public byte field1805;

    @ObfuscatedName("gx.ac")
    public byte field1807;

    static {
        new BitSet(65536);
    }

    public class169(class549 arg0) {
        this.method3310(arg0);
    }

    @ObfuscatedName("gx.ab(I)[I")
    public int[] method3313() {
        if (this.field1800 == null) {
            String[] var1 = new String[this.field1802.size()];
            this.field1800 = new int[this.field1802.size()];
            int var2 = 0;
            while (var2 < this.field1802.size()) {
                var1[var2] = ((class151) this.field1802.get(var2)).field1682.method9471();
                this.field1800[var2] = var2++;
            }
            class543.method666(var1, this.field1800);
        }
        return this.field1800;
    }

    @ObfuscatedName("gx.ay(Lfl;I)V")
    public void method3320(class151 arg0) {
        this.field1802.add(arg0);
        this.field1800 = null;
    }

    @ObfuscatedName("gx.an(II)V")
    public void method3307(int arg0) {
        this.field1802.remove(arg0);
        this.field1800 = null;
    }

    @ObfuscatedName("gx.au(I)I")
    public int method3308() {
        return this.field1802.size();
    }

    @ObfuscatedName("gx.ax(Ljava/lang/String;I)I")
    public int method3309(String arg0) {
        if (!this.field1801) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1802.size(); var2++) {
            if (((class151) this.field1802.get(var2)).field1682.method9470().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gx.ao(Lvg;I)V")
    public void method3310(class549 arg0) {
        int var2 = arg0.method9025();
        if ((var2 & 0x1) != 0) {
            this.field1806 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1801 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method9025();
        }
        this.field5075 = arg0.method8804();
        this.field1804 = arg0.method8804();
        this.field1803 = arg0.method8808();
        arg0.method8810();
        this.field1807 = arg0.method8798();
        this.field1805 = arg0.method8798();
        int var4 = arg0.method8968();
        if (var4 <= 0) {
            return;
        }
        this.field1802 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class151 var6 = new class151();
            if (this.field1806) {
                arg0.method8804();
            }
            if (this.field1801) {
                var6.field1682 = new class572(arg0.method8808());
            }
            var6.field1684 = arg0.method8798();
            var6.field1683 = arg0.method8968();
            if (var3 >= 3) {
                arg0.method8810();
            }
            this.field1802.add(var5, var6);
        }
    }
}
