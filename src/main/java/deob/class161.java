package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ft")
public final class class161 implements Runnable {

    @ObfuscatedName("ft.m")
    public InputStream field2173;

    @ObfuscatedName("ft.p")
    public OutputStream field2174;

    @ObfuscatedName("ft.i")
    public Socket field2180;

    @ObfuscatedName("ft.j")
    public boolean field2179 = false;

    @ObfuscatedName("ft.v")
    public class156 field2176;

    @ObfuscatedName("ft.x")
    public class155 field2178;

    @ObfuscatedName("ft.e")
    public byte[] field2175;

    @ObfuscatedName("ft.l")
    public int field2177 = 0;

    @ObfuscatedName("ft.b")
    public int field2181 = 0;

    @ObfuscatedName("ft.n")
    public boolean field2182 = false;

    @ObfuscatedName("ft.c")
    public final int field2183;

    @ObfuscatedName("ft.a")
    public final int field2184;

    public class161(Socket arg0, class156 arg1, int arg2) throws IOException {
        this.field2176 = arg1;
        this.field2180 = arg0;
        this.field2183 = arg2;
        this.field2184 = arg2 - 100;
        this.field2180.setSoTimeout(30000);
        this.field2180.setTcpNoDelay(true);
        this.field2180.setReceiveBufferSize(65536);
        this.field2180.setSendBufferSize(65536);
        this.field2173 = this.field2180.getInputStream();
        this.field2174 = this.field2180.getOutputStream();
    }

    @ObfuscatedName("ft.m(I)V")
    public void method2851() {
        if (this.field2179) {
            return;
        }
        synchronized (this) {
            this.field2179 = true;
            this.notifyAll();
        }
        if (this.field2178 != null) {
            while (this.field2178.field2141 == 0) {
                class189.method1011(1L);
            }
            if (this.field2178.field2141 == 1) {
                try {
                    ((Thread) this.field2178.field2147).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2178 = null;
    }

    public void finalize() {
        this.method2851();
    }

    @ObfuscatedName("ft.p(B)I")
    public int method2830() throws IOException {
        return this.field2179 ? 0 : this.field2173.read();
    }

    @ObfuscatedName("ft.i(I)I")
    public int method2829() throws IOException {
        return this.field2179 ? 0 : this.field2173.available();
    }

    @ObfuscatedName("ft.j(IB)Z")
    public boolean method2832(int arg0) throws IOException {
        if (this.field2179) {
            return false;
        }
        try {
            return this.field2173.available() >= arg0;
        } catch (IOException var3) {
            throw new IOException("Error reading from clientstream", var3);
        }
    }

    @ObfuscatedName("ft.v([BIII)V")
    public void method2833(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2179) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2173.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ft.x([BIII)V")
    public void method2828(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2179) {
            return;
        }
        if (this.field2182) {
            this.field2182 = false;
            throw new IOException();
        }
        if (this.field2175 == null) {
            this.field2175 = new byte[this.field2183];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2175[this.field2181] = arg0[arg1 + var5];
                this.field2181 = (this.field2181 + 1) % this.field2183;
                if ((this.field2184 + this.field2177) % this.field2183 == this.field2181) {
                    throw new IOException();
                }
            }
            if (this.field2178 == null) {
                this.field2178 = this.field2176.method2797(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2181 == this.field2177) {
                            if (this.field2179) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2177;
                        if (this.field2181 >= this.field2177) {
                            var4 = this.field2181 - this.field2177;
                        } else {
                            var4 = this.field2183 - this.field2177;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2174.write(this.field2175, var3, var4);
                    } catch (IOException var12) {
                        this.field2182 = true;
                    }
                    this.field2177 = (this.field2177 + var4) % this.field2183;
                    try {
                        if (this.field2181 == this.field2177) {
                            this.field2174.flush();
                        }
                    } catch (IOException var11) {
                        this.field2182 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2173 != null) {
                        this.field2173.close();
                    }
                    if (this.field2174 != null) {
                        this.field2174.close();
                    }
                    if (this.field2180 != null) {
                        this.field2180.close();
                    }
                } catch (IOException var10) {
                }
                this.field2175 = null;
                break;
            }
        } catch (Exception var15) {
            class154.method355((String) null, var15);
        }
    }
}
