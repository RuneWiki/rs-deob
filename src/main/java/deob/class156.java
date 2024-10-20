package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("eq")
public class class156 extends class430 {

    @ObfuscatedName("eq.a")
    public boolean field1734;

    @ObfuscatedName("eq.f")
    public boolean field1727 = true;

    @ObfuscatedName("eq.c")
    public List field1728;

    @ObfuscatedName("eq.x")
    public int[] field1729;

    @ObfuscatedName("eq.h")
    public long field1730;

    @ObfuscatedName("eq.j")
    public String field1731 = null;

    @ObfuscatedName("eq.y")
    public byte field1726;

    @ObfuscatedName("eq.d")
    public byte field1732;

    static {
        new BitSet(65536);
    }

    public class156(class464 arg0) {
        this.method2957(arg0);
    }

    @ObfuscatedName("eq.a(B)[I")
    public int[] method2953() {
        if (this.field1729 == null) {
            String[] var1 = new String[this.field1728.size()];
            this.field1729 = new int[this.field1728.size()];
            int var2 = 0;
            while (var2 < this.field1728.size()) {
                var1[var2] = ((class138) this.field1728.get(var2)).field1596.method8295();
                this.field1729[var2] = var2++;
            }
            class461.method2444(var1, this.field1729);
        }
        return this.field1729;
    }

    @ObfuscatedName("eq.f(Lec;I)V")
    public void method2967(class138 arg0) {
        this.field1728.add(arg0);
        this.field1729 = null;
    }

    @ObfuscatedName("eq.c(II)V")
    public void method2955(int arg0) {
        this.field1728.remove(arg0);
        this.field1729 = null;
    }

    @ObfuscatedName("eq.x(B)I")
    public int method2963() {
        return this.field1728.size();
    }

    @ObfuscatedName("eq.h(Ljava/lang/String;I)I")
    public int method2956(String arg0) {
        if (!this.field1727) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1728.size(); var2++) {
            if (((class138) this.field1728.get(var2)).field1596.method8298().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("eq.j(Lqr;B)V")
    public void method2957(class464 arg0) {
        int var2 = arg0.method7735();
        if ((var2 & 0x1) != 0) {
            this.field1734 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1727 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method7735();
        }
        this.field4635 = arg0.method7721();
        this.field1730 = arg0.method7721();
        this.field1731 = arg0.method7725();
        arg0.method7723();
        this.field1732 = arg0.method7881();
        this.field1726 = arg0.method7881();
        int var4 = arg0.method7716();
        if (var4 <= 0) {
            return;
        }
        this.field1728 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class138 var6 = new class138();
            if (this.field1734) {
                arg0.method7721();
            }
            if (this.field1727) {
                var6.field1596 = new class486(arg0.method7725());
            }
            var6.field1598 = arg0.method7881();
            var6.field1591 = arg0.method7716();
            if (var3 >= 3) {
                arg0.method7723();
            }
            this.field1728.add(var5, var6);
        }
    }
}
