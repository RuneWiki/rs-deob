package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gt")
public class class164 extends class489 {

    @ObfuscatedName("gt.am")
    public boolean field1770;

    @ObfuscatedName("gt.ap")
    public boolean field1760 = true;

    @ObfuscatedName("gt.af")
    public List field1761;

    @ObfuscatedName("gt.aj")
    public int[] field1762;

    @ObfuscatedName("gt.aq")
    public long field1765;

    @ObfuscatedName("gt.ar")
    public String field1764 = null;

    @ObfuscatedName("gt.ag")
    public byte field1759;

    @ObfuscatedName("gt.ao")
    public byte field1768;

    static {
        new BitSet(65536);
    }

    public class164(class531 arg0) {
        this.method3204(arg0);
    }

    @ObfuscatedName("gt.am(I)[I")
    public int[] method3200() {
        if (this.field1762 == null) {
            String[] var1 = new String[this.field1761.size()];
            this.field1762 = new int[this.field1761.size()];
            int var2 = 0;
            while (var2 < this.field1761.size()) {
                var1[var2] = ((class146) this.field1761.get(var2)).field1644.method9161();
                this.field1762[var2] = var2++;
            }
            int[] var3 = this.field1762;
            class526.method2325(var1, var3, 0, var1.length - 1);
        }
        return this.field1762;
    }

    @ObfuscatedName("gt.ap(Lfk;I)V")
    public void method3201(class146 arg0) {
        this.field1761.add(arg0);
        this.field1762 = null;
    }

    @ObfuscatedName("gt.af(II)V")
    public void method3207(int arg0) {
        this.field1761.remove(arg0);
        this.field1762 = null;
    }

    @ObfuscatedName("gt.aj(I)I")
    public int method3203() {
        return this.field1761.size();
    }

    @ObfuscatedName("gt.aq(Ljava/lang/String;B)I")
    public int method3206(String arg0) {
        if (!this.field1760) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1761.size(); var2++) {
            if (((class146) this.field1761.get(var2)).field1644.method9164().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gt.ar(Luk;I)V")
    public void method3204(class531 arg0) {
        int var2 = arg0.method8561();
        if ((var2 & 0x1) != 0) {
            this.field1770 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1760 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8561();
        }
        this.field4889 = arg0.method8567();
        this.field1765 = arg0.method8567();
        this.field1764 = arg0.method8641();
        arg0.method8795();
        this.field1768 = arg0.method8562();
        this.field1759 = arg0.method8562();
        int var4 = arg0.method8775();
        if (var4 <= 0) {
            return;
        }
        this.field1761 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class146 var6 = new class146();
            if (this.field1770) {
                arg0.method8567();
            }
            if (this.field1760) {
                var6.field1644 = new class554(arg0.method8641());
            }
            var6.field1642 = arg0.method8562();
            var6.field1643 = arg0.method8775();
            if (var3 >= 3) {
                arg0.method8795();
            }
            this.field1761.add(var5, var6);
        }
    }
}
