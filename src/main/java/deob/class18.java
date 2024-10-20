package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("v")
public class class18 {

    @ObfuscatedName("v.n")
    public int field261;

    @ObfuscatedName("v.g")
    public class138 field262;

    @ObfuscatedName("v.a")
    public DataInputStream field263;

    @ObfuscatedName("v.m")
    public byte[] field264 = new byte[4];

    @ObfuscatedName("v.s")
    public int field265;

    @ObfuscatedName("v.j")
    public byte[] field274;

    @ObfuscatedName("v.f")
    public int field267;

    @ObfuscatedName("v.b")
    public long field268;

    public class18(class128 arg0, URL arg1) {
        this.field262 = arg0.method2570(arg1);
        this.field261 = 0;
        this.field268 = class107.method3364() + 30000L;
    }

    @ObfuscatedName("v.n(I)[B")
    public byte[] method166() throws IOException {
        if (class107.method3364() > this.field268) {
            throw new IOException();
        }
        if (this.field261 == 0) {
            if (this.field262.field2127 == 2) {
                throw new IOException();
            }
            if (this.field262.field2127 == 1) {
                this.field263 = (DataInputStream) this.field262.field2123;
                this.field261 = 1;
            }
        }
        if (this.field261 == 1) {
            int var1 = this.field263.available();
            if (var1 > 0) {
                if (this.field265 + var1 > 4) {
                    var1 = 4 - this.field265;
                }
                this.field265 += this.field263.read(this.field264, this.field265, var1);
                if (this.field265 == 4) {
                    int var2 = (new class111(this.field264)).method2366();
                    this.field274 = new byte[var2];
                    this.field261 = 2;
                }
            }
        }
        if (this.field261 == 2) {
            int var3 = this.field263.available();
            if (var3 > 0) {
                if (this.field267 + var3 > this.field274.length) {
                    var3 = this.field274.length - this.field267;
                }
                this.field267 += this.field263.read(this.field274, this.field267, var3);
                if (this.field267 == this.field274.length) {
                    return this.field274;
                }
            }
        }
        return null;
    }
}
