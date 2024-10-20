package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("l")
public class class19 {

    @ObfuscatedName("l.i")
    public byte[] field260 = new byte[4];

    @ObfuscatedName("l.v")
    public int field261;

    @ObfuscatedName("l.f")
    public class146 field263;

    @ObfuscatedName("l.h")
    public DataInputStream field259;

    @ObfuscatedName("l.a")
    public int field258;

    @ObfuscatedName("l.s")
    public byte[] field262;

    @ObfuscatedName("l.p")
    public int field257;

    @ObfuscatedName("l.r")
    public long field264;

    public class19(class136 arg0, URL arg1) {
        this.field263 = arg0.method2675(arg1);
        this.field261 = 0;
        this.field264 = class115.method2906() + 30000L;
    }

    @ObfuscatedName("l.i(I)[B")
    public byte[] method172() throws IOException {
        if (class115.method2906() > this.field264) {
            throw new IOException();
        }
        if (this.field261 == 0) {
            if (this.field263.field2204 == 2) {
                throw new IOException();
            }
            if (this.field263.field2204 == 1) {
                this.field259 = (DataInputStream) this.field263.field2212;
                this.field261 = 1;
            }
        }
        if (this.field261 == 1) {
            int var1 = this.field259.available();
            if (var1 > 0) {
                if (this.field258 + var1 > 4) {
                    var1 = 4 - this.field258;
                }
                this.field258 += this.field259.read(this.field260, this.field258, var1);
                if (this.field258 == 4) {
                    int var2 = (new class119(this.field260)).method2315();
                    this.field262 = new byte[var2];
                    this.field261 = 2;
                }
            }
        }
        if (this.field261 == 2) {
            int var3 = this.field259.available();
            if (var3 > 0) {
                if (this.field257 + var3 > this.field262.length) {
                    var3 = this.field262.length - this.field257;
                }
                this.field257 += this.field259.read(this.field262, this.field257, var3);
                if (this.field257 == this.field262.length) {
                    return this.field262;
                }
            }
        }
        return null;
    }
}
