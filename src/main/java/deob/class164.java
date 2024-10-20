package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("go")
public class class164 extends class473 {

    @ObfuscatedName("go.au")
    public boolean field1808;

    @ObfuscatedName("go.ae")
    public boolean field1802 = true;

    @ObfuscatedName("go.ao")
    public List field1803;

    @ObfuscatedName("go.at")
    public int[] field1804;

    @ObfuscatedName("go.ac")
    public long field1809;

    @ObfuscatedName("go.ai")
    public String field1806 = null;

    @ObfuscatedName("go.az")
    public byte field1801;

    @ObfuscatedName("go.ap")
    public byte field1805;

    static {
        new BitSet(65536);
    }

    public class164(class515 arg0) {
        this.method3090(arg0);
    }

    @ObfuscatedName("go.au(B)[I")
    public int[] method3084() {
        if (this.field1804 == null) {
            String[] var1 = new String[this.field1803.size()];
            this.field1804 = new int[this.field1803.size()];
            int var2 = 0;
            while (var2 < this.field1803.size()) {
                var1[var2] = ((class146) this.field1803.get(var2)).field1678.method8910();
                this.field1804[var2] = var2++;
            }
            int[] var3 = this.field1804;
            class510.method3458(var1, var3, 0, var1.length - 1);
        }
        return this.field1804;
    }

    @ObfuscatedName("go.ae(Lfu;I)V")
    public void method3072(class146 arg0) {
        this.field1803.add(arg0);
        this.field1804 = null;
    }

    @ObfuscatedName("go.ao(II)V")
    public void method3074(int arg0) {
        this.field1803.remove(arg0);
        this.field1804 = null;
    }

    @ObfuscatedName("go.at(B)I")
    public int method3076() {
        return this.field1803.size();
    }

    @ObfuscatedName("go.ac(Ljava/lang/String;S)I")
    public int method3077(String arg0) {
        if (!this.field1802) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1803.size(); var2++) {
            if (((class146) this.field1803.get(var2)).field1678.method8917().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("go.ai(Ltm;I)V")
    public void method3090(class515 arg0) {
        int var2 = arg0.method8300();
        if ((var2 & 0x1) != 0) {
            this.field1808 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1802 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8300();
        }
        this.field4814 = arg0.method8307();
        this.field1809 = arg0.method8307();
        this.field1806 = arg0.method8311();
        arg0.method8309();
        this.field1805 = arg0.method8301();
        this.field1801 = arg0.method8301();
        int var4 = arg0.method8448();
        if (var4 <= 0) {
            return;
        }
        this.field1803 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class146 var6 = new class146();
            if (this.field1808) {
                arg0.method8307();
            }
            if (this.field1802) {
                var6.field1678 = new class538(arg0.method8311());
            }
            var6.field1679 = arg0.method8301();
            var6.field1681 = arg0.method8448();
            if (var3 >= 3) {
                arg0.method8309();
            }
            this.field1803.add(var5, var6);
        }
    }
}
