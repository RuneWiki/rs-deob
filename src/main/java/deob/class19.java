package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("t")
public class class19 {

    @ObfuscatedName("t.h")
    public int field262;

    @ObfuscatedName("t.m")
    public class146 field256;

    @ObfuscatedName("t.i")
    public byte[] field258 = new byte[4];

    @ObfuscatedName("t.q")
    public DataInputStream field257;

    @ObfuscatedName("t.p")
    public int field259;

    @ObfuscatedName("t.c")
    public byte[] field260;

    @ObfuscatedName("t.f")
    public int field268;

    @ObfuscatedName("t.y")
    public long field267;

    public class19(class136 arg0, URL arg1) {
        this.field256 = arg0.method2691(arg1);
        this.field262 = 0;
        this.field267 = class115.method2007() + 30000L;
    }

    @ObfuscatedName("t.h(I)[B")
    public byte[] method183() throws IOException {
        if (class115.method2007() > this.field267) {
            throw new IOException();
        }
        if (this.field262 == 0) {
            if (this.field256.field2215 == 2) {
                throw new IOException();
            }
            if (this.field256.field2215 == 1) {
                this.field257 = (DataInputStream) this.field256.field2219;
                this.field262 = 1;
            }
        }
        if (this.field262 == 1) {
            int var1 = this.field257.available();
            if (var1 > 0) {
                if (this.field259 + var1 > 4) {
                    var1 = 4 - this.field259;
                }
                this.field259 += this.field257.read(this.field258, this.field259, var1);
                if (this.field259 == 4) {
                    int var2 = (new class119(this.field258)).method2324();
                    this.field260 = new byte[var2];
                    this.field262 = 2;
                }
            }
        }
        if (this.field262 == 2) {
            int var3 = this.field257.available();
            if (var3 > 0) {
                if (this.field268 + var3 > this.field260.length) {
                    var3 = this.field260.length - this.field268;
                }
                this.field268 += this.field257.read(this.field260, this.field268, var3);
                if (this.field268 == this.field260.length) {
                    return this.field260;
                }
            }
        }
        return null;
    }
}
