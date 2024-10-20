package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ai")
public class class50 extends class51 {

    @ObfuscatedName("ai.p")
    public AudioFormat field1082;

    @ObfuscatedName("ai.j")
    public SourceDataLine field1080;

    @ObfuscatedName("ai.w")
    public int field1081;

    @ObfuscatedName("ai.h")
    public byte[] field1083;

    @ObfuscatedName("ai.p(Ljava/awt/Component;)V")
    public void method892(Component arg0) {
        this.field1082 = new AudioFormat((float) Statics.field1265, 16, Statics.field1031 ? 2 : 1, true, false);
        this.field1083 = new byte[0x100 << (Statics.field1031 ? 2 : 1)];
    }

    @ObfuscatedName("ai.j(I)V")
    public void method891(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1082, arg0 << (Statics.field1031 ? 2 : 1));
            this.field1080 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1080.open();
            this.field1080.start();
            this.field1081 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1080 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method891(var17);
        }
    }

    @ObfuscatedName("ai.w()I")
    public int method894() {
        return this.field1081 - (this.field1080.available() >> (Statics.field1031 ? 2 : 1));
    }

    @ObfuscatedName("ai.h()V")
    public void method899() {
        int var1 = 256;
        if (Statics.field1031) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1086[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1083[var2 * 2] = (byte) (var3 >> 8);
            this.field1083[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1080.write(this.field1083, 0, var1 << 1);
    }

    @ObfuscatedName("ai.v()V")
    public void method896() {
        if (this.field1080 != null) {
            this.field1080.close();
            this.field1080 = null;
        }
    }

    @ObfuscatedName("ai.k()V")
    public void method897() {
        this.field1080.flush();
    }
}
