package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("l")
public class class69 {

    @ObfuscatedName("l.d")
    public long field1014;

    @ObfuscatedName("l.b")
    public DataInputStream field1004;

    @ObfuscatedName("l.c")
    public class157 field1003;

    @ObfuscatedName("l.m")
    public int field1006;

    @ObfuscatedName("l.i")
    public byte[] field1005 = new byte[4];

    @ObfuscatedName("l.v")
    public int field1013;

    @ObfuscatedName("l.z")
    public byte[] field1007;

    @ObfuscatedName("l.x")
    public int field1002;

    @ObfuscatedName("l.v(I)[B")
    public byte[] method1081() throws IOException {
        if (class42.method1378() > this.field1014) {
            throw new IOException();
        }
        if (this.field1013 == 0) {
            if (this.field1003.field2364 == 2) {
                throw new IOException();
            }
            if (this.field1003.field2364 == 1) {
                this.field1004 = (DataInputStream) this.field1003.field2360;
                this.field1013 = 1;
            }
        }
        if (this.field1013 == 1) {
            int var1 = this.field1004.available();
            if (var1 > 0) {
                if (this.field1006 + var1 > 4) {
                    var1 = 4 - this.field1006;
                }
                this.field1006 += this.field1004.read(this.field1005, this.field1006, var1);
                if (this.field1006 == 4) {
                    int var2 = (new class28(this.field1005)).method504();
                    this.field1007 = new byte[var2];
                    this.field1013 = 2;
                }
            }
        }
        if (this.field1013 == 2) {
            int var3 = this.field1004.available();
            if (var3 > 0) {
                if (this.field1002 + var3 > this.field1007.length) {
                    var3 = this.field1007.length - this.field1002;
                }
                this.field1002 += this.field1004.read(this.field1007, this.field1002, var3);
                if (this.field1002 == this.field1007.length) {
                    return this.field1007;
                }
            }
        }
        return null;
    }

    public class69(class130 arg0, URL arg1) {
        this.field1003 = arg0.method2244(arg1);
        this.field1013 = 0;
        this.field1014 = class42.method1378() + 30000L;
    }
}
