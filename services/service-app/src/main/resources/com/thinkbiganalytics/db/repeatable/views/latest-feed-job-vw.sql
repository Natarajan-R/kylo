-- -
-- #%L
-- kylo-service-app
-- %%
-- Copyright (C) 2017 ThinkBig Analytics
-- %%
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
-- 
--     http://www.apache.org/licenses/LICENSE-2.0
-- 
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
-- #L%
-- -

/**
Latest JOB EXECUTION grouped by Feed
 */
CREATE OR REPLACE VIEW LATEST_FEED_JOB_VW AS
          SELECT
    f.id AS FEED_ID,
    f.name AS FEED_NAME,
    f.is_stream AS IS_STREAM,
    MAX(e.JOB_EXECUTION_ID) AS JOB_EXECUTION_ID
    FROM
    ((BATCH_JOB_EXECUTION e
    JOIN BATCH_JOB_INSTANCE i ON ((i.JOB_INSTANCE_ID = e.JOB_INSTANCE_ID)))
    JOIN FEED f ON ((f.id = i.FEED_ID)))
    GROUP BY f.id , f.name, f.is_stream
