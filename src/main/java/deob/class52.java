package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ak")
public class class52 extends class53 {

    @ObfuscatedName("ak.i")
    public AudioFormat field1099;

    @ObfuscatedName("ak.b")
    public SourceDataLine field1098;

    @ObfuscatedName("ak.r")
    public int field1097;

    @ObfuscatedName("ak.l")
    public byte[] field1100;

    @ObfuscatedName("ak.i(Ljava/awt/Component;)V")
    public void method945(Component arg0) {
        this.field1099 = new AudioFormat((float) Statics.field2014, 16, Statics.field1104 ? 2 : 1, true, false);
        this.field1100 = new byte[0x100 << (Statics.field1104 ? 2 : 1)];
    }

    @ObfuscatedName("ak.b(I)V")
    public void method936(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1099, arg0 << (Statics.field1104 ? 2 : 1));
            this.field1098 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1098.open();
            this.field1098.start();
            this.field1097 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1098 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method936(var17);
        }
    }

    @ObfuscatedName("ak.r()I")
    public int method937() {
        return this.field1097 - (this.field1098.available() >> (Statics.field1104 ? 2 : 1));
    }

    @ObfuscatedName("ak.l()V")
    public void method935() {
        int var1 = 256;
        if (Statics.field1104) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1103[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1100[var2 * 2] = (byte) (var3 >> 8);
            this.field1100[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1098.write(this.field1100, 0, var1 << 1);
    }

    @ObfuscatedName("ak.s()V")
    public void method939() {
        if (this.field1098 != null) {
            this.field1098.close();
            this.field1098 = null;
        }
    }

    @ObfuscatedName("ak.d()V")
    public void method940() {
        this.field1098.flush();
    }
}
