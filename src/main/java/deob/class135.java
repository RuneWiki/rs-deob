package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ez")
public final class class135 implements Runnable {

    @ObfuscatedName("ez.n")
    public InputStream field2089;

    @ObfuscatedName("ez.g")
    public OutputStream field2088;

    @ObfuscatedName("ez.a")
    public Socket field2096;

    @ObfuscatedName("ez.m")
    public boolean field2095 = false;

    @ObfuscatedName("ez.s")
    public class128 field2091;

    @ObfuscatedName("ez.j")
    public class138 field2092;

    @ObfuscatedName("ez.f")
    public byte[] field2093;

    @ObfuscatedName("ez.b")
    public int field2094 = 0;

    @ObfuscatedName("ez.t")
    public int field2087 = 0;

    @ObfuscatedName("ez.i")
    public boolean field2090 = false;

    public class135(Socket arg0, class128 arg1) throws IOException {
        this.field2091 = arg1;
        this.field2096 = arg0;
        this.field2096.setSoTimeout(30000);
        this.field2096.setTcpNoDelay(true);
        this.field2089 = this.field2096.getInputStream();
        this.field2088 = this.field2096.getOutputStream();
    }

    @ObfuscatedName("ez.a(B)V")
    public void method2685() {
        if (this.field2095) {
            return;
        }
        synchronized (this) {
            this.field2095 = true;
            this.notifyAll();
        }
        if (this.field2092 != null) {
            while (this.field2092.field2127 == 0) {
                class119.method2154(1L);
            }
            if (this.field2092.field2127 == 1) {
                try {
                    ((Thread) this.field2092.field2123).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2092 = null;
    }

    public void finalize() {
        this.method2685();
    }

    @ObfuscatedName("ez.m(B)I")
    public int method2686() throws IOException {
        return this.field2095 ? 0 : this.field2089.read();
    }

    @ObfuscatedName("ez.s(I)I")
    public int method2695() throws IOException {
        return this.field2095 ? 0 : this.field2089.available();
    }

    @ObfuscatedName("ez.j([BIII)V")
    public void method2702(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2095) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2089.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ez.f([BIII)V")
    public void method2688(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2095) {
            return;
        }
        if (this.field2090) {
            this.field2090 = false;
            throw new IOException();
        }
        if (this.field2093 == null) {
            this.field2093 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2093[this.field2087] = arg0[arg1 + var5];
                this.field2087 = (this.field2087 + 1) % 5000;
                if ((this.field2094 + 4900) % 5000 == this.field2087) {
                    throw new IOException();
                }
            }
            if (this.field2092 == null) {
                this.field2092 = this.field2091.method2581(this, 3);
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
                        if (this.field2094 == this.field2087) {
                            if (this.field2095) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2094;
                        if (this.field2087 >= this.field2094) {
                            var4 = this.field2087 - this.field2094;
                        } else {
                            var4 = 5000 - this.field2094;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2088.write(this.field2093, var3, var4);
                    } catch (IOException var12) {
                        this.field2090 = true;
                    }
                    this.field2094 = (this.field2094 + var4) % 5000;
                    try {
                        if (this.field2094 == this.field2087) {
                            this.field2088.flush();
                        }
                    } catch (IOException var11) {
                        this.field2090 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2089 != null) {
                        this.field2089.close();
                    }
                    if (this.field2088 != null) {
                        this.field2088.close();
                    }
                    if (this.field2096 != null) {
                        this.field2096.close();
                    }
                } catch (IOException var10) {
                }
                this.field2093 = null;
                break;
            }
        } catch (Exception var15) {
            class140.method2829((String) null, var15);
        }
    }
}
