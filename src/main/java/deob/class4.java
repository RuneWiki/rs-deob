package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("y")
public class class4 extends class352 {

    @ObfuscatedName("y.v")
    public boolean field31;

    @ObfuscatedName("y.n")
    public boolean field28 = true;

    @ObfuscatedName("y.f")
    public List field29;

    @ObfuscatedName("y.y")
    public int[] field36;

    @ObfuscatedName("y.p")
    public long field30;

    @ObfuscatedName("y.j")
    public String field32 = null;

    @ObfuscatedName("y.r")
    public byte field33;

    @ObfuscatedName("y.b")
    public byte field27;

    static {
        new BitSet(65536);
    }

    public class4(class383 arg0) {
        this.method25(arg0);
    }

    @ObfuscatedName("y.v(I)[I")
    public int[] method20() {
        if (this.field36 == null) {
            String[] var1 = new String[this.field29.size()];
            this.field36 = new int[this.field29.size()];
            int var2 = 0;
            while (var2 < this.field29.size()) {
                var1[var2] = ((class10) this.field29.get(var2)).field85;
                this.field36[var2] = var2++;
            }
            class378.method1822(var1, this.field36);
        }
        return this.field36;
    }

    @ObfuscatedName("y.n(Ls;I)V")
    public void method38(class10 arg0) {
        this.field29.add(arg0);
        this.field36 = null;
    }

    @ObfuscatedName("y.f(IB)V")
    public void method22(int arg0) {
        this.field29.remove(arg0);
        this.field36 = null;
    }

    @ObfuscatedName("y.y(B)I")
    public int method23() {
        return this.field29.size();
    }

    @ObfuscatedName("y.p(Ljava/lang/String;I)I")
    public int method26(String arg0) {
        if (!this.field28) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field29.size(); var2++) {
            if (((class10) this.field29.get(var2)).field85.equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("y.j(Lnd;I)V")
    public void method25(class383 arg0) {
        int var2 = arg0.method5965();
        if ((var2 & 0x1) != 0) {
            this.field31 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field28 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method5965();
        }
        this.field3938 = arg0.method5971();
        this.field30 = arg0.method5971();
        this.field32 = arg0.method5974();
        arg0.method5954();
        this.field27 = arg0.method5966();
        this.field33 = arg0.method5966();
        int var4 = arg0.method5967();
        if (var4 <= 0) {
            return;
        }
        this.field29 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class10 var6 = new class10();
            if (this.field31) {
                arg0.method5971();
            }
            if (this.field28) {
                var6.field85 = arg0.method5974();
            }
            var6.field84 = arg0.method5966();
            var6.field80 = arg0.method5967();
            if (var3 >= 3) {
                arg0.method5954();
            }
            this.field29.add(var5, var6);
        }
    }
}
