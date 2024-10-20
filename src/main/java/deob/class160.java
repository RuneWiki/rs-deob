package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("fm")
public class class160 extends class440 {

    @ObfuscatedName("fm.f")
    public boolean field1790;

    @ObfuscatedName("fm.w")
    public boolean field1791 = true;

    @ObfuscatedName("fm.v")
    public List field1794;

    @ObfuscatedName("fm.s")
    public int[] field1792;

    @ObfuscatedName("fm.z")
    public long field1793;

    @ObfuscatedName("fm.j")
    public String field1799 = null;

    @ObfuscatedName("fm.i")
    public byte field1795;

    @ObfuscatedName("fm.n")
    public byte field1796;

    static {
        new BitSet(65536);
    }

    public class160(class474 arg0) {
        this.method3119(arg0);
    }

    @ObfuscatedName("fm.f(I)[I")
    public int[] method3121() {
        if (this.field1792 == null) {
            String[] var1 = new String[this.field1794.size()];
            this.field1792 = new int[this.field1794.size()];
            int var2 = 0;
            while (var2 < this.field1794.size()) {
                var1[var2] = ((class142) this.field1794.get(var2)).field1656.method8572();
                this.field1792[var2] = var2++;
            }
            int[] var3 = this.field1792;
            class471.method4498(var1, var3, 0, var1.length - 1);
        }
        return this.field1792;
    }

    @ObfuscatedName("fm.w(Leu;I)V")
    public void method3115(class142 arg0) {
        this.field1794.add(arg0);
        this.field1792 = null;
    }

    @ObfuscatedName("fm.v(II)V")
    public void method3116(int arg0) {
        this.field1794.remove(arg0);
        this.field1792 = null;
    }

    @ObfuscatedName("fm.s(I)I")
    public int method3120() {
        return this.field1794.size();
    }

    @ObfuscatedName("fm.z(Ljava/lang/String;I)I")
    public int method3118(String arg0) {
        if (!this.field1791) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1794.size(); var2++) {
            if (((class142) this.field1794.get(var2)).field1656.method8556().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("fm.j(Lrd;I)V")
    public void method3119(class474 arg0) {
        int var2 = arg0.method7964();
        if ((var2 & 0x1) != 0) {
            this.field1790 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1791 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method7964();
        }
        this.field4711 = arg0.method8151();
        this.field1793 = arg0.method8151();
        this.field1799 = arg0.method7983();
        arg0.method7972();
        this.field1796 = arg0.method7965();
        this.field1795 = arg0.method7965();
        int var4 = arg0.method8032();
        if (var4 <= 0) {
            return;
        }
        this.field1794 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class142 var6 = new class142();
            if (this.field1790) {
                arg0.method8151();
            }
            if (this.field1791) {
                var6.field1656 = new class497(arg0.method7983());
            }
            var6.field1657 = arg0.method7965();
            var6.field1659 = arg0.method8032();
            if (var3 >= 3) {
                arg0.method7972();
            }
            this.field1794.add(var5, var6);
        }
    }
}
