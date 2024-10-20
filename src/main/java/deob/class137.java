package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("ea")
public class class137 extends class370 {

    @ObfuscatedName("ea.i")
    public boolean field1511;

    @ObfuscatedName("ea.w")
    public boolean field1519 = true;

    @ObfuscatedName("ea.s")
    public List field1518;

    @ObfuscatedName("ea.a")
    public int[] field1514;

    @ObfuscatedName("ea.o")
    public long field1515;

    @ObfuscatedName("ea.g")
    public String field1516 = null;

    @ObfuscatedName("ea.e")
    public byte field1517;

    @ObfuscatedName("ea.p")
    public byte field1512;

    static {
        new BitSet(65536);
    }

    public class137(class401 arg0) {
        this.method2535(arg0);
    }

    @ObfuscatedName("ea.i(B)[I")
    public int[] method2531() {
        if (this.field1514 == null) {
            String[] var1 = new String[this.field1518.size()];
            this.field1514 = new int[this.field1518.size()];
            int var2 = 0;
            while (var2 < this.field1518.size()) {
                var1[var2] = ((class119) this.field1518.get(var2)).field1384.method6830();
                this.field1514[var2] = var2++;
            }
            int[] var3 = this.field1514;
            class396.method2412(var1, var3, 0, var1.length - 1);
        }
        return this.field1514;
    }

    @ObfuscatedName("ea.w(Lde;B)V")
    public void method2532(class119 arg0) {
        this.field1518.add(arg0);
        this.field1514 = null;
    }

    @ObfuscatedName("ea.s(II)V")
    public void method2549(int arg0) {
        this.field1518.remove(arg0);
        this.field1514 = null;
    }

    @ObfuscatedName("ea.a(B)I")
    public int method2538() {
        return this.field1518.size();
    }

    @ObfuscatedName("ea.o(Ljava/lang/String;I)I")
    public int method2546(String arg0) {
        if (!this.field1519) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1518.size(); var2++) {
            if (((class119) this.field1518.get(var2)).field1384.method6813().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ea.g(Lop;I)V")
    public void method2535(class401 arg0) {
        int var2 = arg0.method6240();
        if ((var2 & 0x1) != 0) {
            this.field1511 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1519 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method6240();
        }
        this.field4075 = arg0.method6249();
        this.field1515 = arg0.method6249();
        this.field1516 = arg0.method6335();
        arg0.method6429();
        this.field1512 = arg0.method6241();
        this.field1517 = arg0.method6241();
        int var4 = arg0.method6242();
        if (var4 <= 0) {
            return;
        }
        this.field1518 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class119 var6 = new class119();
            if (this.field1511) {
                arg0.method6249();
            }
            if (this.field1519) {
                var6.field1384 = new class422(arg0.method6335());
            }
            var6.field1388 = arg0.method6241();
            var6.field1385 = arg0.method6242();
            if (var3 >= 3) {
                arg0.method6429();
            }
            this.field1518.add(var5, var6);
        }
    }
}
