package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("eb")
public class class137 extends class369 {

    @ObfuscatedName("eb.n")
    public boolean field1520;

    @ObfuscatedName("eb.c")
    public boolean field1513 = true;

    @ObfuscatedName("eb.m")
    public List field1515;

    @ObfuscatedName("eb.k")
    public int[] field1516;

    @ObfuscatedName("eb.o")
    public long field1517;

    @ObfuscatedName("eb.g")
    public String field1518 = null;

    @ObfuscatedName("eb.z")
    public byte field1519;

    @ObfuscatedName("eb.a")
    public byte field1514;

    static {
        new BitSet(65536);
    }

    public class137(class400 arg0) {
        this.method2479(arg0);
    }

    @ObfuscatedName("eb.n(I)[I")
    public int[] method2483() {
        if (this.field1516 == null) {
            String[] var1 = new String[this.field1515.size()];
            this.field1516 = new int[this.field1515.size()];
            int var2 = 0;
            while (var2 < this.field1515.size()) {
                var1[var2] = ((class119) this.field1515.get(var2)).field1396.method6783();
                this.field1516[var2] = var2++;
            }
            class395.method575(var1, this.field1516);
        }
        return this.field1516;
    }

    @ObfuscatedName("eb.c(Ldr;I)V")
    public void method2474(class119 arg0) {
        this.field1515.add(arg0);
        this.field1516 = null;
    }

    @ObfuscatedName("eb.m(IB)V")
    public void method2475(int arg0) {
        this.field1515.remove(arg0);
        this.field1516 = null;
    }

    @ObfuscatedName("eb.k(I)I")
    public int method2476() {
        return this.field1515.size();
    }

    @ObfuscatedName("eb.o(Ljava/lang/String;I)I")
    public int method2473(String arg0) {
        if (!this.field1513) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1515.size(); var2++) {
            if (((class119) this.field1515.get(var2)).field1396.method6800().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("eb.g(Lot;I)V")
    public void method2479(class400 arg0) {
        int var2 = arg0.method6217();
        if ((var2 & 0x1) != 0) {
            this.field1520 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1513 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method6217();
        }
        this.field4056 = arg0.method6223();
        this.field1517 = arg0.method6223();
        this.field1518 = arg0.method6226();
        arg0.method6197();
        this.field1514 = arg0.method6218();
        this.field1519 = arg0.method6218();
        int var4 = arg0.method6219();
        if (var4 <= 0) {
            return;
        }
        this.field1515 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class119 var6 = new class119();
            if (this.field1520) {
                arg0.method6223();
            }
            if (this.field1513) {
                var6.field1396 = new class421(arg0.method6226());
            }
            var6.field1394 = arg0.method6218();
            var6.field1395 = arg0.method6219();
            if (var3 >= 3) {
                arg0.method6197();
            }
            this.field1515.add(var5, var6);
        }
    }
}
