package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ap")
public class class39 extends class27 {

    @ObfuscatedName("ap.h")
    public HashSet field329;

    @ObfuscatedName("ap.k")
    public HashSet field325;

    @ObfuscatedName("ap.x")
    public List field326;

    @ObfuscatedName("ap.co(Lkc;Lkc;IZI)V")
    public void method610(class300 arg0, class300 arg1, int arg2, boolean arg3) {
        this.method344(arg0, arg2);
        int var5 = arg1.method5166();
        this.field329 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class16 var7 = new class16();
            try {
                var7.method188(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field329.add(var7);
        }
        int var9 = arg1.method5166();
        this.field325 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class40 var11 = new class40();
            try {
                var11.method620(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field325.add(var11);
        }
        this.method616(arg1, arg3);
    }

    @ObfuscatedName("ap.cu(Lkc;ZB)V")
    public void method616(class300 arg0, boolean arg1) {
        this.field326 = new LinkedList();
        int var3 = arg0.method5166();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5152();
            class214 var6 = new class214(arg0.method5155());
            boolean var7 = arg0.method5123() == 1;
            if (arg1 || !var7) {
                this.field326.add(new class19((class214) null, var6, var5, (class29) null));
            }
        }
    }
}
