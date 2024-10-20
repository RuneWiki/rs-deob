package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ey")
public final class class134 implements Runnable {

    @ObfuscatedName("ey.v")
    public InputStream field2050;

    @ObfuscatedName("ey.t")
    public OutputStream field2048;

    @ObfuscatedName("ey.f")
    public Socket field2046;

    @ObfuscatedName("ey.j")
    public boolean field2045 = false;

    @ObfuscatedName("ey.l")
    public class127 field2047;

    @ObfuscatedName("ey.g")
    public class137 field2044;

    @ObfuscatedName("ey.k")
    public byte[] field2049;

    @ObfuscatedName("ey.p")
    public int field2051 = 0;

    @ObfuscatedName("ey.y")
    public int field2052 = 0;

    @ObfuscatedName("ey.m")
    public boolean field2053 = false;

    public class134(Socket arg0, class127 arg1) throws IOException {
        this.field2047 = arg1;
        this.field2046 = arg0;
        this.field2046.setSoTimeout(30000);
        this.field2046.setTcpNoDelay(true);
        this.field2050 = this.field2046.getInputStream();
        this.field2048 = this.field2046.getOutputStream();
    }

    @ObfuscatedName("ey.f(I)V")
    public void method2625() {
        if (this.field2045) {
            return;
        }
        synchronized (this) {
            this.field2045 = true;
            this.notifyAll();
        }
        if (this.field2044 != null) {
            while (this.field2044.field2078 == 0) {
                class118.method2729(1L);
            }
            if (this.field2044.field2078 == 1) {
                try {
                    ((Thread) this.field2044.field2079).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2044 = null;
    }

    public void finalize() {
        this.method2625();
    }

    @ObfuscatedName("ey.j(S)I")
    public int method2624() throws IOException {
        return this.field2045 ? 0 : this.field2050.read();
    }

    @ObfuscatedName("ey.l(I)I")
    public int method2626() throws IOException {
        return this.field2045 ? 0 : this.field2050.available();
    }

    @ObfuscatedName("ey.g([BIII)V")
    public void method2627(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2045) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2050.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ey.k([BIIB)V")
    public void method2628(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2045) {
            return;
        }
        if (this.field2053) {
            this.field2053 = false;
            throw new IOException();
        }
        if (this.field2049 == null) {
            this.field2049 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2049[this.field2052] = arg0[arg1 + var5];
                this.field2052 = (this.field2052 + 1) % 5000;
                if ((this.field2051 + 4900) % 5000 == this.field2052) {
                    throw new IOException();
                }
            }
            if (this.field2044 == null) {
                this.field2044 = this.field2047.method2547(this, 3);
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
                        if (this.field2052 == this.field2051) {
                            if (this.field2045) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2051;
                        if (this.field2052 >= this.field2051) {
                            var4 = this.field2052 - this.field2051;
                        } else {
                            var4 = 5000 - this.field2051;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2048.write(this.field2049, var3, var4);
                    } catch (IOException var12) {
                        this.field2053 = true;
                    }
                    this.field2051 = (this.field2051 + var4) % 5000;
                    try {
                        if (this.field2052 == this.field2051) {
                            this.field2048.flush();
                        }
                    } catch (IOException var11) {
                        this.field2053 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2050 != null) {
                        this.field2050.close();
                    }
                    if (this.field2048 != null) {
                        this.field2048.close();
                    }
                    if (this.field2046 != null) {
                        this.field2046.close();
                    }
                } catch (IOException var10) {
                }
                this.field2049 = null;
                break;
            }
        } catch (Exception var15) {
            class139.method2439((String) null, var15);
        }
    }
}
