package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("ec")
public class class149 extends class411 {

    @ObfuscatedName("ec.s")
    public boolean field1666;

    @ObfuscatedName("ec.h")
    public boolean field1664 = true;

    @ObfuscatedName("ec.w")
    public List field1663;

    @ObfuscatedName("ec.v")
    public int[] field1669;

    @ObfuscatedName("ec.c")
    public long field1671;

    @ObfuscatedName("ec.q")
    public String field1668 = null;

    @ObfuscatedName("ec.i")
    public byte field1667;

    @ObfuscatedName("ec.k")
    public byte field1670;

    static {
        new BitSet(65536);
    }

    public class149(class444 arg0) {
        this.method2770(arg0);
    }

    @ObfuscatedName("ec.s(B)[I")
    public int[] method2765() {
        if (this.field1669 == null) {
            String[] var1 = new String[this.field1663.size()];
            this.field1669 = new int[this.field1663.size()];
            int var2 = 0;
            while (var2 < this.field1663.size()) {
                var1[var2] = ((class131) this.field1663.get(var2)).field1544.method7492();
                this.field1669[var2] = var2++;
            }
            int[] var3 = this.field1669;
            class441.method5120(var1, var3, 0, var1.length - 1);
        }
        return this.field1669;
    }

    @ObfuscatedName("ec.h(Lev;I)V")
    public void method2766(class131 arg0) {
        this.field1663.add(arg0);
        this.field1669 = null;
    }

    @ObfuscatedName("ec.w(IB)V")
    public void method2781(int arg0) {
        this.field1663.remove(arg0);
        this.field1669 = null;
    }

    @ObfuscatedName("ec.v(I)I")
    public int method2768() {
        return this.field1663.size();
    }

    @ObfuscatedName("ec.c(Ljava/lang/String;I)I")
    public int method2778(String arg0) {
        if (!this.field1664) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1663.size(); var2++) {
            if (((class131) this.field1663.get(var2)).field1544.method7491().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ec.q(Lqr;B)V")
    public void method2770(class444 arg0) {
        int var2 = arg0.method6929();
        if ((var2 & 0x1) != 0) {
            this.field1666 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1664 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method6929();
        }
        this.field4468 = arg0.method6935();
        this.field1671 = arg0.method6935();
        this.field1668 = arg0.method6975();
        arg0.method6937();
        this.field1670 = arg0.method6930();
        this.field1667 = arg0.method6930();
        int var4 = arg0.method7120();
        if (var4 <= 0) {
            return;
        }
        this.field1663 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class131 var6 = new class131();
            if (this.field1666) {
                arg0.method6935();
            }
            if (this.field1664) {
                var6.field1544 = new class465(arg0.method6975());
            }
            var6.field1543 = arg0.method6930();
            var6.field1542 = arg0.method7120();
            if (var3 >= 3) {
                arg0.method6937();
            }
            this.field1663.add(var5, var6);
        }
    }
}
