package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("au")
public class class52 extends class53 {

    @ObfuscatedName("au.e")
    public AudioFormat field1108;

    @ObfuscatedName("au.i")
    public SourceDataLine field1105;

    @ObfuscatedName("au.k")
    public int field1107;

    @ObfuscatedName("au.q")
    public byte[] field1106;

    @ObfuscatedName("au.e(Ljava/awt/Component;)V")
    public void method968(Component arg0) {
        this.field1108 = new AudioFormat((float) Statics.field1126, 16, Statics.field1118 ? 2 : 1, true, false);
        this.field1106 = new byte[0x100 << (Statics.field1118 ? 2 : 1)];
    }

    @ObfuscatedName("au.i(I)V")
    public void method977(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1108, arg0 << (Statics.field1118 ? 2 : 1));
            this.field1105 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1105.open();
            this.field1105.start();
            this.field1107 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1105 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method977(var17);
        }
    }

    @ObfuscatedName("au.k()I")
    public int method967() {
        return this.field1107 - (this.field1105.available() >> (Statics.field1118 ? 2 : 1));
    }

    @ObfuscatedName("au.q()V")
    public void method969() {
        int var1 = 256;
        if (Statics.field1118) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1113[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1106[var2 * 2] = (byte) (var3 >> 8);
            this.field1106[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1105.write(this.field1106, 0, var1 << 1);
    }

    @ObfuscatedName("au.j()V")
    public void method976() {
        if (this.field1105 != null) {
            this.field1105.close();
            this.field1105 = null;
        }
    }

    @ObfuscatedName("au.z()V")
    public void method971() {
        this.field1105.flush();
    }
}
