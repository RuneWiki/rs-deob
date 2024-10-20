package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gn")
public class class165 extends class485 {

    @ObfuscatedName("gn.at")
    public boolean field1771;

    @ObfuscatedName("gn.ah")
    public boolean field1766 = true;

    @ObfuscatedName("gn.ar")
    public List field1769;

    @ObfuscatedName("gn.ao")
    public int[] field1768;

    @ObfuscatedName("gn.ab")
    public long field1773;

    @ObfuscatedName("gn.au")
    public String field1770 = null;

    @ObfuscatedName("gn.aa")
    public byte field1767;

    @ObfuscatedName("gn.ac")
    public byte field1772;

    static {
        new BitSet(65536);
    }

    public class165(class527 arg0) {
        this.method3192(arg0);
    }

    @ObfuscatedName("gn.at(B)[I")
    public int[] method3175() {
        if (this.field1768 == null) {
            String[] var1 = new String[this.field1769.size()];
            this.field1768 = new int[this.field1769.size()];
            int var2 = 0;
            while (var2 < this.field1769.size()) {
                var1[var2] = ((class147) this.field1769.get(var2)).field1648.method9074();
                this.field1768[var2] = var2++;
            }
            int[] var3 = this.field1768;
            class522.method7807(var1, var3, 0, var1.length - 1);
        }
        return this.field1768;
    }

    @ObfuscatedName("gn.ah(Lft;I)V")
    public void method3176(class147 arg0) {
        this.field1769.add(arg0);
        this.field1768 = null;
    }

    @ObfuscatedName("gn.ar(IB)V")
    public void method3183(int arg0) {
        this.field1769.remove(arg0);
        this.field1768 = null;
    }

    @ObfuscatedName("gn.ao(B)I")
    public int method3190() {
        return this.field1769.size();
    }

    @ObfuscatedName("gn.ab(Ljava/lang/String;B)I")
    public int method3195(String arg0) {
        if (!this.field1766) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1769.size(); var2++) {
            if (((class147) this.field1769.get(var2)).field1648.method9073().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gn.au(Luj;B)V")
    public void method3192(class527 arg0) {
        int var2 = arg0.method8410();
        if ((var2 & 0x1) != 0) {
            this.field1771 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1766 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8410();
        }
        this.field4849 = arg0.method8417();
        this.field1773 = arg0.method8417();
        this.field1770 = arg0.method8535();
        arg0.method8572();
        this.field1772 = arg0.method8616();
        this.field1767 = arg0.method8616();
        int var4 = arg0.method8412();
        if (var4 <= 0) {
            return;
        }
        this.field1769 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class147 var6 = new class147();
            if (this.field1771) {
                arg0.method8417();
            }
            if (this.field1766) {
                var6.field1648 = new class550(arg0.method8535());
            }
            var6.field1649 = arg0.method8616();
            var6.field1647 = arg0.method8412();
            if (var3 >= 3) {
                arg0.method8572();
            }
            this.field1769.add(var5, var6);
        }
    }
}
