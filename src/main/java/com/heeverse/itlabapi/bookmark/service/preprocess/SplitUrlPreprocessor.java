package com.heeverse.itlabapi.bookmark.service.preprocess;

import com.heeverse.itlabapi.bookmark.exceptions.FailedSplitUrlException;
import com.heeverse.itlabapi.bookmark.domain.vo.UrlComponent;
import com.heeverse.itlabapi.common.utils.HostInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequiredArgsConstructor
@Component
public class SplitUrlPreprocessor implements UrlPreprocessor {

    private final HostInfo hostInfo;

    @Override
    public UrlComponent preprocess(String fullUrl) {

        Matcher matcher = PATTERN.URL_SPLIT.matcher(fullUrl);
        if (!matcher.find()) {
            throw new FailedSplitUrlException(fullUrl);
        }

        return createUrlComponent(matcher);
    }

    private UrlComponent createUrlComponent(Matcher matcher) {

        int group = matcher.groupCount();
        if (group == 3) {
            return new UrlComponent(
                    matcher.group(0),
                    matcher.group(1),
                    matcher.group(2),
                    matcher.group(3));
        }
        throw new FailedSplitUrlException(matcher.group(0));
    }

    protected static class PATTERN {
        static final String URL_SPLIT_REGEX = "(https?:\\/\\/)(?:www\\.)?([-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b)*(\\/[\\/\\d\\w@:%._\\+~#=?&\\.-]*)*";
        static final Pattern URL_SPLIT = Pattern.compile(URL_SPLIT_REGEX);

    }
}
