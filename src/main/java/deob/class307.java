package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lh")
public class class307 extends class286 {

    @ObfuscatedName("lh.ap")
    public HashSet field3270;

    @ObfuscatedName("lh.ab")
    public HashSet field3268;

    @ObfuscatedName("lh.az")
    public List field3267;

    @ObfuscatedName("lh.cs(Lvf;Lvf;IZI)V")
    public void method5637(class551 arg0, class551 arg1, int arg2, boolean arg3) {
        this.method5291(arg0, arg2);
        int var5 = arg1.method9119();
        this.field3270 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class281 var7 = new class281();
            try {
                var7.method5224(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3270.add(var7);
        }
        int var9 = arg1.method9119();
        this.field3268 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class289 var11 = new class289();
            try {
                var11.method5529(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3268.add(var11);
        }
        this.method5638(arg1, arg3);
    }

    @ObfuscatedName("lh.cp(Lvf;ZB)V")
    public void method5638(class551 arg0, boolean arg1) {
        this.field3267 = new LinkedList();
        int var3 = arg0.method9119();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method9205();
            class352 var6 = new class352(arg0.method9110());
            boolean var7 = arg0.method8955() == 1;
            if (arg1 || !var7) {
                this.field3267.add(new class292((class352) null, var6, var5, (class299) null));
            }
        }
    }
}
