package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bq")
public class class70 extends class57 {

    @ObfuscatedName("bq.k")
    public AudioFormat field1264;

    @ObfuscatedName("bq.h")
    public SourceDataLine field1261;

    @ObfuscatedName("bq.ad")
    public int field1263;

    @ObfuscatedName("bq.as")
    public byte[] field1262;

    @ObfuscatedName("bq.k(Ljava/awt/Component;)V")
    public void method1065(Component arg0) {
        this.field1264 = new AudioFormat((float) Statics.field2148, 16, Statics.field1074 ? 2 : 1, true, false);
        this.field1262 = new byte[0x100 << (Statics.field1074 ? 2 : 1)];
    }

    @ObfuscatedName("bq.h(I)V")
    public void method1066(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1264, arg0 << (Statics.field1074 ? 2 : 1));
            this.field1261 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1261.open();
            this.field1261.start();
            this.field1263 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1261 = null;
                throw var11;
            } else {
                this.method1066(class126.method617(arg0));
            }
        }
    }

    @ObfuscatedName("bq.o()I")
    public int method1067() {
        return this.field1263 - (this.field1261.available() >> (Statics.field1074 ? 2 : 1));
    }

    @ObfuscatedName("bq.z()V")
    public void method1070() {
        int var1 = 256;
        if (Statics.field1074) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1155[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1262[var2 * 2] = (byte) (var3 >> 8);
            this.field1262[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1261.write(this.field1262, 0, var1 << 1);
    }

    @ObfuscatedName("bq.c()V")
    public void method1068() {
        if (this.field1261 != null) {
            this.field1261.close();
            this.field1261 = null;
        }
    }

    @ObfuscatedName("bq.d()V")
    public void method1073() {
        this.field1261.flush();
    }
}
