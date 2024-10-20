package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ao")
public class class51 extends class52 {

    @ObfuscatedName("ao.a")
    public AudioFormat field1077;

    @ObfuscatedName("ao.r")
    public SourceDataLine field1075;

    @ObfuscatedName("ao.u")
    public int field1074;

    @ObfuscatedName("ao.t")
    public byte[] field1076;

    @ObfuscatedName("ao.a(Ljava/awt/Component;)V")
    public void method874(Component arg0) {
        this.field1077 = new AudioFormat((float) Statics.field1080, 16, Statics.field2456 ? 2 : 1, true, false);
        this.field1076 = new byte[0x100 << (Statics.field2456 ? 2 : 1)];
    }

    @ObfuscatedName("ao.r(I)V")
    public void method870(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1077, arg0 << (Statics.field2456 ? 2 : 1));
            this.field1075 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1075.open();
            this.field1075.start();
            this.field1074 = arg0;
        } catch (LineUnavailableException var4) {
            if (class124.method64(arg0) == 1) {
                this.field1075 = null;
                throw var4;
            } else {
                this.method870(class124.method128(arg0));
            }
        }
    }

    @ObfuscatedName("ao.u()I")
    public int method871() {
        return this.field1074 - (this.field1075.available() >> (Statics.field2456 ? 2 : 1));
    }

    @ObfuscatedName("ao.t()V")
    public void method872() {
        int var1 = 256;
        if (Statics.field2456) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1081[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1076[var2 * 2] = (byte) (var3 >> 8);
            this.field1076[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1075.write(this.field1076, 0, var1 << 1);
    }

    @ObfuscatedName("ao.k()V")
    public void method873() {
        if (this.field1075 != null) {
            this.field1075.close();
            this.field1075 = null;
        }
    }

    @ObfuscatedName("ao.x()V")
    public void method877() {
        this.field1075.flush();
    }
}
