package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("y")
public class class4 extends class353 {

    @ObfuscatedName("y.f")
    public boolean field32;

    @ObfuscatedName("y.e")
    public boolean field22 = true;

    @ObfuscatedName("y.v")
    public List field24;

    @ObfuscatedName("y.y")
    public int[] field35;

    @ObfuscatedName("y.j")
    public long field26;

    @ObfuscatedName("y.o")
    public String field25 = null;

    @ObfuscatedName("y.m")
    public byte field28;

    @ObfuscatedName("y.r")
    public byte field29;

    static {
        new BitSet(65536);
    }

    public class4(class384 arg0) {
        this.method31(arg0);
    }

    @ObfuscatedName("y.f(I)[I")
    public int[] method26() {
        if (this.field35 == null) {
            String[] var1 = new String[this.field24.size()];
            this.field35 = new int[this.field24.size()];
            int var2 = 0;
            while (var2 < this.field24.size()) {
                var1[var2] = ((class10) this.field24.get(var2)).field67;
                this.field35[var2] = var2++;
            }
            int[] var3 = this.field35;
            class379.method3953(var1, var3, 0, var1.length - 1);
        }
        return this.field35;
    }

    @ObfuscatedName("y.e(Ld;I)V")
    public void method42(class10 arg0) {
        this.field24.add(arg0);
        this.field35 = null;
    }

    @ObfuscatedName("y.v(IB)V")
    public void method28(int arg0) {
        this.field24.remove(arg0);
        this.field35 = null;
    }

    @ObfuscatedName("y.y(I)I")
    public int method41() {
        return this.field24.size();
    }

    @ObfuscatedName("y.j(Ljava/lang/String;I)I")
    public int method30(String arg0) {
        if (!this.field22) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field24.size(); var2++) {
            if (((class10) this.field24.get(var2)).field67.equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("y.o(Lnt;I)V")
    public void method31(class384 arg0) {
        int var2 = arg0.method5902();
        if ((var2 & 0x1) != 0) {
            this.field32 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field22 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method5902();
        }
        this.field3937 = arg0.method5896();
        this.field26 = arg0.method5896();
        this.field25 = arg0.method5906();
        arg0.method5904();
        this.field29 = arg0.method5968();
        this.field28 = arg0.method5968();
        int var4 = arg0.method5899();
        if (var4 <= 0) {
            return;
        }
        this.field24 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class10 var6 = new class10();
            if (this.field32) {
                arg0.method5896();
            }
            if (this.field22) {
                var6.field67 = arg0.method5906();
            }
            var6.field71 = arg0.method5968();
            var6.field65 = arg0.method5899();
            if (var3 >= 3) {
                arg0.method5904();
            }
            this.field24.add(var5, var6);
        }
    }
}
