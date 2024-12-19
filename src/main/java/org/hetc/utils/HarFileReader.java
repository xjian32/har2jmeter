package org.hetc.utils;

import com.google.gson.Gson;
import org.hetc.model.HarJsonRootBean;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @ClassName: HarFileReader
 * @Author: Jaxx
 * @Date: 2024/12/19
 * @Description:
 **/
public class HarFileReader {

    private static Gson gson = new Gson();
    public static HarJsonRootBean readFile(String filePath) throws IOException {
        String readString = Files.readString(Path.of(filePath));
        return gson.fromJson(readString, HarJsonRootBean.class);
    }
}
