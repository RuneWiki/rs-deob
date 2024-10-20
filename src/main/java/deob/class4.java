package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("p")
public class class4 extends class351 {

    @ObfuscatedName("p.f")
    public boolean field33;

    @ObfuscatedName("p.o")
    public boolean field29 = true;

    @ObfuscatedName("p.u")
    public List field28;

    @ObfuscatedName("p.p")
    public int[] field27;

    @ObfuscatedName("p.b")
    public long field30;

    @ObfuscatedName("p.e")
    public String field26 = null;

    @ObfuscatedName("p.k")
    public byte field32;

    @ObfuscatedName("p.g")
    public byte field31;

    static {
        new BitSet(65536);
    }

    public class4(class382 arg0) {
        this.method39(arg0);
    }

    @ObfuscatedName("p.f(B)[I")
    public int[] method35() {
        if (this.field27 == null) {
            String[] var1 = new String[this.field28.size()];
            this.field27 = new int[this.field28.size()];
            int var2 = 0;
            while (var2 < this.field28.size()) {
                var1[var2] = ((class10) this.field28.get(var2)).field66;
                this.field27[var2] = var2++;
            }
            int[] var3 = this.field27;
            class377.method4080(var1, var3, 0, var1.length - 1);
        }
        return this.field27;
    }

    @ObfuscatedName("p.o(Ln;I)V")
    public void method52(class10 arg0) {
        this.field28.add(arg0);
        this.field27 = null;
    }

    @ObfuscatedName("p.u(II)V")
    public void method36(int arg0) {
        this.field28.remove(arg0);
        this.field27 = null;
    }

    @ObfuscatedName("p.p(I)I")
    public int method37() {
        return this.field28.size();
    }

    @ObfuscatedName("p.b(Ljava/lang/String;B)I")
    public int method34(String arg0) {
        if (!this.field29) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field28.size(); var2++) {
            if (((class10) this.field28.get(var2)).field66.equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("p.e(Lnu;I)V")
    public void method39(class382 arg0) {
        int var2 = arg0.method5856();
        if ((var2 & 0x1) != 0) {
            this.field33 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field29 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method5856();
        }
        this.field3941 = arg0.method6069();
        this.field30 = arg0.method6069();
        this.field26 = arg0.method5865();
        arg0.method5847();
        this.field31 = arg0.method6045();
        this.field32 = arg0.method6045();
        int var4 = arg0.method5858();
        if (var4 <= 0) {
            return;
        }
        this.field28 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class10 var6 = new class10();
            if (this.field33) {
                arg0.method6069();
            }
            if (this.field29) {
                var6.field66 = arg0.method5865();
            }
            var6.field67 = arg0.method6045();
            var6.field65 = arg0.method5858();
            if (var3 >= 3) {
                arg0.method5847();
            }
            this.field28.add(var5, var6);
        }
    }
}
