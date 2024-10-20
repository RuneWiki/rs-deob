package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("eb")
public class class137 extends class370 {

    @ObfuscatedName("eb.l")
    public boolean field1523;

    @ObfuscatedName("eb.q")
    public boolean field1512 = true;

    @ObfuscatedName("eb.f")
    public List field1514;

    @ObfuscatedName("eb.j")
    public int[] field1515;

    @ObfuscatedName("eb.m")
    public long field1516;

    @ObfuscatedName("eb.k")
    public String field1517 = null;

    @ObfuscatedName("eb.t")
    public byte field1518;

    @ObfuscatedName("eb.a")
    public byte field1513;

    static {
        new BitSet(65536);
    }

    public class137(class401 arg0) {
        this.method2518(arg0);
    }

    @ObfuscatedName("eb.l(I)[I")
    public int[] method2520() {
        if (this.field1515 == null) {
            String[] var1 = new String[this.field1514.size()];
            this.field1515 = new int[this.field1514.size()];
            int var2 = 0;
            while (var2 < this.field1514.size()) {
                var1[var2] = ((class119) this.field1514.get(var2)).field1392.method6816();
                this.field1515[var2] = var2++;
            }
            int[] var3 = this.field1515;
            class396.method6024(var1, var3, 0, var1.length - 1);
        }
        return this.field1515;
    }

    @ObfuscatedName("eb.q(Ldo;I)V")
    public void method2514(class119 arg0) {
        this.field1514.add(arg0);
        this.field1515 = null;
    }

    @ObfuscatedName("eb.f(IB)V")
    public void method2515(int arg0) {
        this.field1514.remove(arg0);
        this.field1515 = null;
    }

    @ObfuscatedName("eb.j(B)I")
    public int method2516() {
        return this.field1514.size();
    }

    @ObfuscatedName("eb.m(Ljava/lang/String;I)I")
    public int method2526(String arg0) {
        if (!this.field1512) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1514.size(); var2++) {
            if (((class119) this.field1514.get(var2)).field1392.method6815().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("eb.k(Lot;I)V")
    public void method2518(class401 arg0) {
        int var2 = arg0.method6272();
        if ((var2 & 0x1) != 0) {
            this.field1523 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1512 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method6272();
        }
        this.field4075 = arg0.method6275();
        this.field1516 = arg0.method6275();
        this.field1517 = arg0.method6474();
        arg0.method6483();
        this.field1513 = arg0.method6273();
        this.field1518 = arg0.method6273();
        int var4 = arg0.method6284();
        if (var4 <= 0) {
            return;
        }
        this.field1514 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class119 var6 = new class119();
            if (this.field1523) {
                arg0.method6275();
            }
            if (this.field1512) {
                var6.field1392 = new class422(arg0.method6474());
            }
            var6.field1394 = arg0.method6273();
            var6.field1391 = arg0.method6284();
            if (var3 >= 3) {
                arg0.method6483();
            }
            this.field1514.add(var5, var6);
        }
    }
}
