package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fa")
public final class class161 implements Runnable {

    @ObfuscatedName("fa.d")
    public InputStream field2170;

    @ObfuscatedName("fa.x")
    public OutputStream field2169;

    @ObfuscatedName("fa.k")
    public Socket field2178;

    @ObfuscatedName("fa.z")
    public boolean field2171 = false;

    @ObfuscatedName("fa.v")
    public class156 field2172;

    @ObfuscatedName("fa.m")
    public class155 field2168;

    @ObfuscatedName("fa.b")
    public byte[] field2174;

    @ObfuscatedName("fa.t")
    public int field2175 = 0;

    @ObfuscatedName("fa.p")
    public int field2176 = 0;

    @ObfuscatedName("fa.r")
    public boolean field2177 = false;

    @ObfuscatedName("fa.l")
    public final int field2173;

    @ObfuscatedName("fa.u")
    public final int field2179;

    public class161(Socket arg0, class156 arg1, int arg2) throws IOException {
        this.field2172 = arg1;
        this.field2178 = arg0;
        this.field2173 = arg2;
        this.field2179 = arg2 - 100;
        this.field2178.setSoTimeout(30000);
        this.field2178.setTcpNoDelay(true);
        this.field2178.setReceiveBufferSize(65536);
        this.field2178.setSendBufferSize(65536);
        this.field2170 = this.field2178.getInputStream();
        this.field2169 = this.field2178.getOutputStream();
    }

    @ObfuscatedName("fa.d(S)V")
    public void method2867() {
        if (this.field2171) {
            return;
        }
        synchronized (this) {
            this.field2171 = true;
            this.notifyAll();
        }
        if (this.field2168 != null) {
            while (this.field2168.field2133 == 0) {
                class189.method13(1L);
            }
            if (this.field2168.field2133 == 1) {
                try {
                    ((Thread) this.field2168.field2141).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2168 = null;
    }

    public void finalize() {
        this.method2867();
    }

    @ObfuscatedName("fa.x(I)I")
    public int method2872() throws IOException {
        return this.field2171 ? 0 : this.field2170.read();
    }

    @ObfuscatedName("fa.k(I)I")
    public int method2862() throws IOException {
        return this.field2171 ? 0 : this.field2170.available();
    }

    @ObfuscatedName("fa.z(IB)Z")
    public boolean method2863(int arg0) throws IOException {
        if (this.field2171) {
            return false;
        }
        try {
            return this.field2170.available() >= arg0;
        } catch (IOException var3) {
            throw new IOException("Error reading from clientstream", var3);
        }
    }

    @ObfuscatedName("fa.v([BIII)V")
    public void method2864(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2171) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2170.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("fa.m([BIII)V")
    public void method2871(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2171) {
            return;
        }
        if (this.field2177) {
            this.field2177 = false;
            throw new IOException();
        }
        if (this.field2174 == null) {
            this.field2174 = new byte[this.field2173];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2174[this.field2176] = arg0[arg1 + var5];
                this.field2176 = (this.field2176 + 1) % this.field2173;
                if ((this.field2179 + this.field2175) % this.field2173 == this.field2176) {
                    throw new IOException();
                }
            }
            if (this.field2168 == null) {
                this.field2168 = this.field2172.method2824(this, 3);
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
                        if (this.field2176 == this.field2175) {
                            if (this.field2171) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2175;
                        if (this.field2176 >= this.field2175) {
                            var4 = this.field2176 - this.field2175;
                        } else {
                            var4 = this.field2173 - this.field2175;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2169.write(this.field2174, var3, var4);
                    } catch (IOException var12) {
                        this.field2177 = true;
                    }
                    this.field2175 = (this.field2175 + var4) % this.field2173;
                    try {
                        if (this.field2176 == this.field2175) {
                            this.field2169.flush();
                        }
                    } catch (IOException var11) {
                        this.field2177 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2170 != null) {
                        this.field2170.close();
                    }
                    if (this.field2169 != null) {
                        this.field2169.close();
                    }
                    if (this.field2178 != null) {
                        this.field2178.close();
                    }
                } catch (IOException var10) {
                }
                this.field2174 = null;
                break;
            }
        } catch (Exception var15) {
            class154.method1684((String) null, var15);
        }
    }
}
